package com.github.rudroid.twofactor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final /* synthetic */ a[] v;

    static {
        a aVar = new a("FETCHING", 0);
        r = aVar;
        a aVar2 = new a("PROMPT", 1);
        s = aVar2;
        a aVar3 = new a("APPROVED", 2);
        t = aVar3;
        a aVar4 = new a("REJECTED", 3);
        u = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        v = aVarArr;
        v8.l0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) v.clone();
    }

    public a(Object... a) {
    }
}
