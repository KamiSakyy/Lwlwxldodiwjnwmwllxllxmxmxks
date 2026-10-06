package com.github.rudroid.uitoolkit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final /* synthetic */ a[] A;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public float r;

    static {
        a aVar = new a("Avatar16", 0, ih.a.u);
        s = aVar;
        a aVar2 = new a("Avatar20", 1, ih.a.v);
        t = aVar2;
        a aVar3 = new a("Avatar24", 2, ih.a.w);
        u = aVar3;
        a aVar4 = new a("Avatar32", 3, ih.a.x);
        v = aVar4;
        a aVar5 = new a("Avatar36", 4, ih.a.y);
        w = aVar5;
        a aVar6 = new a("Avatar40", 5, ih.a.z);
        x = aVar6;
        a aVar7 = new a("Avatar44", 6, ih.a.A);
        y = aVar7;
        a aVar8 = new a("Avatar48", 7, ih.a.B);
        a aVar9 = new a("Avatar64", 8, ih.a.C);
        z = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        A = aVarArr;
        v8.l0.t(aVarArr);
    }

    public a(String str, int i, float f) {
        this.r = f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) A.clone();
    }
    public Object ordinal() { return null; }
}
