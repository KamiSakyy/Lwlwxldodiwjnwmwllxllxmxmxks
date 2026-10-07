package com.kamisakyy.noxchat;

import android.util.Base64;

import org.webrtc.PeerConnection;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/** Built-in public ICE fallbacks plus an optional private TURN server. */
final class IceServerConfig {
    private static final String[] STUN_URLS = {
            "stun:stun.l.google.com:19302",
            "stun:stun1.l.google.com:19302",
            "stun:stun2.l.google.com:19302",
            "stun:stun3.l.google.com:19302",
            "stun:stun4.l.google.com:19302",
            "stun:openrelay.metered.ca:80"
    };

    /*
     * Metered publishes this shared secret for its static-auth endpoint (documented
     * for Nextcloud). This client uses the standard time-limited HMAC credential
     * format, but that direct Android flow has not been verified against a live
     * Open Relay session. Treat these public relay entries as best-effort only.
     */
    private static final String OPEN_RELAY_HOST = "staticauth.openrelay.metered.ca";
    private static final String OPEN_RELAY_PUBLIC_SECRET = "openrelayprojectsecret";
    private static final long TURN_CREDENTIAL_LIFETIME_SECONDS = 24L * 60L * 60L;
    private static final String[] OPEN_RELAY_URLS = {
            "turn:" + OPEN_RELAY_HOST + ":80?transport=udp",
            "turn:" + OPEN_RELAY_HOST + ":80?transport=tcp",
            "turn:" + OPEN_RELAY_HOST + ":443?transport=tcp",
            "turns:" + OPEN_RELAY_HOST + ":443?transport=tcp"
    };

    private IceServerConfig() { }

    static List<PeerConnection.IceServer> create() {
        ArrayList<PeerConnection.IceServer> servers = new ArrayList<>();
        for (String url : STUN_URLS) {
            servers.add(PeerConnection.IceServer.builder(url).createIceServer());
        }

        Credentials credentials = createOpenRelayCredentials();
        if (credentials != null) {
            for (String url : OPEN_RELAY_URLS) {
                servers.add(PeerConnection.IceServer.builder(url)
                        .setUsername(credentials.username)
                        .setPassword(credentials.password)
                        .createIceServer());
            }
        }

        // Keep support for a user-owned TURN relay configured through CI/local Gradle properties.
        if (BuildConfig.TURN_URL != null && !BuildConfig.TURN_URL.trim().isEmpty()) {
            servers.add(PeerConnection.IceServer.builder(BuildConfig.TURN_URL.trim())
                    .setUsername(BuildConfig.TURN_USERNAME == null ? "" : BuildConfig.TURN_USERNAME)
                    .setPassword(BuildConfig.TURN_CREDENTIAL == null ? "" : BuildConfig.TURN_CREDENTIAL)
                    .createIceServer());
        }
        return servers;
    }

    private static Credentials createOpenRelayCredentials() {
        try {
            long expiresAt = System.currentTimeMillis() / 1000L + TURN_CREDENTIAL_LIFETIME_SECONDS;
            String username = expiresAt + ":nox-android";
            Mac hmac = Mac.getInstance("HmacSHA1");
            hmac.init(new SecretKeySpec(OPEN_RELAY_PUBLIC_SECRET.getBytes(StandardCharsets.UTF_8), "HmacSHA1"));
            byte[] digest = hmac.doFinal(username.getBytes(StandardCharsets.UTF_8));
            String password = Base64.encodeToString(digest, Base64.NO_WRAP);
            return new Credentials(username, password);
        } catch (Exception ignored) {
            return null;
        }
    }

    private static final class Credentials {
        final String username;
        final String password;
        Credentials(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
