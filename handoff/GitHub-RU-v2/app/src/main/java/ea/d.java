package ea;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class d {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final /* synthetic */ d[] D;

    /* renamed from: r, reason: collision with root package name */
    public static final d f22181r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f22182s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f22183t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f22184u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f22185v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f22186w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f22187x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f22188y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f22189z;

    static {
        d dVar = new d("BEGIN_ARRAY", 0);
        f22181r = dVar;
        d dVar2 = new d("END_ARRAY", 1);
        f22182s = dVar2;
        d dVar3 = new d("BEGIN_OBJECT", 2);
        f22183t = dVar3;
        d dVar4 = new d("END_OBJECT", 3);
        f22184u = dVar4;
        d dVar5 = new d("NAME", 4);
        f22185v = dVar5;
        d dVar6 = new d("STRING", 5);
        f22186w = dVar6;
        d dVar7 = new d("NUMBER", 6);
        f22187x = dVar7;
        d dVar8 = new d("LONG", 7);
        f22188y = dVar8;
        d dVar9 = new d("BOOLEAN", 8);
        f22189z = dVar9;
        d dVar10 = new d("NULL", 9);
        A = dVar10;
        d dVar11 = new d("END_DOCUMENT", 10);
        B = dVar11;
        d dVar12 = new d("ANY", 11);
        C = dVar12;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12};
        D = dVarArr;
        l0.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) D.clone();
    }

    public d(Object... a) {
    }
}
