package cc;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    public static final b f4170r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f4171s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f4172t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f4173u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ b[] f4174v;

    static {
        b bVar = new b("FAST", 0);
        f4170r = bVar;
        b bVar2 = new b("VERSATILE", 1);
        f4171s = bVar2;
        b bVar3 = new b("POWERFUL", 2);
        f4172t = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        f4173u = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f4174v = bVarArr;
        l0.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4174v.clone();
    }

    public static cc.b r;
}
