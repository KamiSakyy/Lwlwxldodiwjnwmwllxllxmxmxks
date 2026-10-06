package r2;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    public static final b f31097r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f31098s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f31099t;

    static {
        b bVar = new b("Lsq2", 0);
        f31097r = bVar;
        b bVar2 = new b("Impulse", 1);
        f31098s = bVar2;
        b[] bVarArr = {bVar, bVar2};
        f31099t = bVarArr;
        l0.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f31099t.clone();
    }
    public Object ordinal() { return null; }
}
