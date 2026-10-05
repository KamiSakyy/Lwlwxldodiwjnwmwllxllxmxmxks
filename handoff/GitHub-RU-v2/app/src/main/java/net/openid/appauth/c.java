package net.openid.appauth;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class c {
    public static final AuthorizationException a;
    public static final AuthorizationException b;

    static {
        AuthorizationException.a("Invalid discovery document", 0);
        a = AuthorizationException.a("User cancelled flow", 1);
        b = AuthorizationException.a("Flow cancelled programmatically", 2);
        AuthorizationException.a("Network error", 3);
        AuthorizationException.a("Server error", 4);
        AuthorizationException.a("JSON deserialization error", 5);
        AuthorizationException.a("Token response construction error", 6);
        AuthorizationException.a("Invalid registration response", 7);
        AuthorizationException.a("Unable to parse ID Token", 8);
        AuthorizationException.a("Invalid ID Token", 9);
    }
}
