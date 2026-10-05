package en;

import android.security.keystore.KeyGenParameterSpec;
import com.github.domain.twofactor.keystore.TwoFactorException;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.spec.ECGenParameterSpec;
import k71.k;
import oa.j;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final a Companion = new a();
    public static final Charset c = t71.a.a;
    public final String a;
    public final String b;

    public b(j jVar) {
        k.g(jVar, "user");
        String str = jVar.b;
        String str2 = jVar.a;
        this.a = i.g("2fa_", str, "_", str2, "_sign");
        this.b = i.g("2fa_", str, "_", str2, "_recovery");
    }

    public static KeyGenParameterSpec a(String str) {
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").build();
        k.f(build, "build(...)");
        return build;
    }

    public static KeyStore b() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore;
    }

    public final void c() {
        try {
            b().deleteEntry(this.a);
        } catch (Exception unused) {
        }
    }

    public final byte[] d(byte[] bArr) {
        Key key = b().getKey(this.a, null);
        PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
        if (privateKey == null) {
            throw new TwoFactorException("no cert found");
        }
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }

    public final boolean e(String str, byte[] bArr) {
        k.g(bArr, "signature");
        byte[] bytes = str.getBytes(c);
        k.f(bytes, "getBytes(...)");
        Certificate certificate = b().getCertificate(this.a);
        if (certificate == null) {
            throw new TwoFactorException("no cert found");
        }
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initVerify(certificate);
        signature.update(bytes);
        return signature.verify(bArr);
    }
}
