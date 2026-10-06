package com.github.rudroid.common;

import com.github.rudroid.copilot.h1;
import java.util.Map;
import net.openid.appauth.AuthorizationException;

/* loaded from: /home/user/work/p/classes.dex */
public interface e {
    public static final a Companion = a.f9263a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f9263a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final i f9264b = new c("initialized, starting upload");

        /* renamed from: c, reason: collision with root package name */
        public static final i f9265c = new c("finishing upload via PUT");

        /* renamed from: d, reason: collision with root package name */
        public static final i f9266d = new c("Failed OAuth with zero browsers installed");

        /* renamed from: e, reason: collision with root package name */
        public static final i f9267e = new c("Failed login due to user denying OAuth app permissions");

        /* renamed from: f, reason: collision with root package name */
        public static final i f9268f = new c("LoginActivity created");

        /* renamed from: g, reason: collision with root package name */
        public static final i f9269g = new c("ReLoginActivity created");

        /* renamed from: h, reason: collision with root package name */
        public static final i f9270h = new c("LoginActivity destroyed");
        public static final i i = new c("ReLoginActivity destroyed");

        /* renamed from: j, reason: collision with root package name */
        public static final i f9271j = new c("LoginActivity starting Auth");

        /* renamed from: k, reason: collision with root package name */
        public static final i f9272k = new c("LoginActivity onActivityResult");
        public static final i l = new c("LoginActivity verifying response");
        public static final i m = new c("LoginActivity fetching token");

        /* renamed from: n, reason: collision with root package name */
        public static final i f9273n = new c("ApiFailure is null");

        /* renamed from: o, reason: collision with root package name */
        public static final i f9274o = new c("Missing state or code");

        /* renamed from: p, reason: collision with root package name */
        public static final i f9275p = new c("Missing OAuth onActivityResult data");

        /* renamed from: q, reason: collision with root package name */
        public static final i f9276q = new c("Failed to log in review lab user");

        /* renamed from: r, reason: collision with root package name */
        public static final i f9277r = new c("Failed to fetch capabilities due to api failure");

        /* renamed from: s, reason: collision with root package name */
        public static final i f9278s = new c("Failed to fetch user avatar due to api failure");

        /* renamed from: t, reason: collision with root package name */
        public static final i f9279t = new c("Successfully fetched capabilities");

        /* renamed from: u, reason: collision with root package name */
        public static final i f9280u = new c("Failed to add user due to SecurityException");

        /* renamed from: v, reason: collision with root package name */
        public static final i f9281v = new c("Failed to get user from UserManager");

        /* renamed from: w, reason: collision with root package name */
        public static final i f9282w = new c("finished fetchAccessToken");

        /* renamed from: x, reason: collision with root package name */
        public static final i f9283x = new c("Failed to authorize due to api failure while fetching token");

        /* renamed from: y, reason: collision with root package name */
        public static final i f9284y = new c("successfully requested token");

        /* renamed from: z, reason: collision with root package name */
        public static final i f9285z = new c("user is null or not set in time");
        public static final i A = new c("Failed to verify server due to api failure");
        public static final i B = new c("Failed to verify user due to to api failure");

        public static i a(AuthorizationException authorizationException, boolean z10, int i10) {
            String str;
            String name;
            if (authorizationException != null) {
                if (z10) {
                    Throwable cause = authorizationException.getCause();
                    if (cause == null || (name = cause.getMessage()) == null) {
                        name = "IdTokenException";
                    }
                } else {
                    Throwable cause2 = authorizationException.getCause();
                    name = cause2 != null ? cause2.getClass().getName() : "unknown";
                }
                str = "Invalid OAuth response for errorCode: " + i10 + " cause: " + name;
            } else {
                str = "Invalid OAuth response for errorCode: UNKNOWN";
            }
            return new a0(str, "messages in IdTokenException are all hardcoded, see https://github.com/openid/AppAuth-Android/blob/master/library/java/net/openid/appauth/IdToken.java");
        }

        public static i b(long j10) {
            return new a0(h1.m("initializing upload, file size reported is: ", j10), "This is the authority of a local URI, so it is safe to log");
        }

        public static i c(String str) {
            return new a0("parsing file data, authority is ".concat(str), "This is zje authority of a local URI, so it is safe to log");
        }

        public static i d(l0 l0Var) {
            return new a0(f1.e.g("graphql endpoint verification: ", l0Var.f9345a), "user verification message is being build in LoginViewModel");
        }

        public static i e(String str, String str2) {
            k71.k.g(str, "message");
            if (str2 != null && str2.length() != 0) {
                str = t71.w.C(str, str2, "GHES_Server_Url");
            }
            return new a0(str, "url is being removed from the message, it should not contain PII");
        }

        public static i f(l0 l0Var) {
            return new a0(f1.e.g("server verification: ", l0Var.f9345a), "server verification message is being build in LoginViewModel");
        }

        public static i g(Exception exc) {
            return new a0("Failed OAuth for unknown reasons: ".concat(exc.getClass().getName()), "java class names are safe to log");
        }

        public static i h(l0 l0Var) {
            return new a0(f1.e.g("user verification: ", l0Var.f9345a), "user verification message is being build in LoginViewModel");
        }
    }

    public static class b {
    }

    static /* synthetic */ void a(e eVar, Throwable th, Map map, int i) {
        if ((i & 2) != 0) {
            map = x61.s.r;
        }
        eVar.c(th, map, true);
    }

    default void b(String str, Throwable th, boolean z10) {
        k71.k.g(th, "error");
        c(th, x61.x.t(new w61.k("TAG", str)), z10);
    }

    void c(Throwable th, Map map, boolean z10);
}
