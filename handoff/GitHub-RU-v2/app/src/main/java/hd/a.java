package hd;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: r, reason: collision with root package name */
    public static final a f25586r;

    /* renamed from: s, reason: collision with root package name */
    public static final a f25587s;

    /* renamed from: t, reason: collision with root package name */
    public static final a f25588t;

    /* renamed from: u, reason: collision with root package name */
    public static final a f25589u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f25590v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f25591w;

    /* renamed from: x, reason: collision with root package name */
    public static final a f25592x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f25593y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a[] f25594z;

    static {
        a aVar = new a("UNKNOWN", 0);
        f25586r = aVar;
        a aVar2 = new a("PENDING", 1);
        f25587s = aVar2;
        a aVar3 = new a("DOWNLOADING", 2);
        f25588t = aVar3;
        a aVar4 = new a("DOWNLOADED", 3);
        f25589u = aVar4;
        a aVar5 = new a("INSTALLING", 4);
        f25590v = aVar5;
        a aVar6 = new a("INSTALLED", 5);
        f25591w = aVar6;
        a aVar7 = new a("FAILED", 6);
        f25592x = aVar7;
        a aVar8 = new a("CANCELED", 7);
        f25593y = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        f25594z = aVarArr;
        l0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f25594z.clone();
    }
}
