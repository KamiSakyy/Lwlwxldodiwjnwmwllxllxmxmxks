package t71;

import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f32104a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f32105b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f32106c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Charset f32107d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Charset f32108e;

    static {
        Charset forName = Charset.forName("UTF-8");
        k71.k.f(forName, "forName(...)");
        f32104a = forName;
        k71.k.f(Charset.forName("UTF-16"), "forName(...)");
        Charset forName2 = Charset.forName("UTF-16BE");
        k71.k.f(forName2, "forName(...)");
        f32105b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        k71.k.f(forName3, "forName(...)");
        f32106c = forName3;
        k71.k.f(Charset.forName("US-ASCII"), "forName(...)");
        k71.k.f(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
