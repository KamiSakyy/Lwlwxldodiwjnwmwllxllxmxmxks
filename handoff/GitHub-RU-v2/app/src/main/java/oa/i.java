package oa;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {
    public static String a(String str, String str2) {
        k71.k.g(str, "login");
        StringBuilder sb2 = new StringBuilder(str);
        if (str2 != null) {
            sb2.append(":");
            sb2.append(str2);
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }
}
