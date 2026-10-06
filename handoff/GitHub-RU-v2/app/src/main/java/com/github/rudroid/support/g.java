package com.github.rudroid.support;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final g r;
    public static final g s;
    public static final g t;
    public static final g u;
    public static final /* synthetic */ g[] v;

    static {
        g gVar = new g("SubjectTooShort", 0);
        r = gVar;
        g gVar2 = new g("SubjectTooLong", 1);
        s = gVar2;
        g gVar3 = new g("BodyTooShort", 2);
        t = gVar3;
        g gVar4 = new g("BodyTooLong", 3);
        u = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        v = gVarArr;
        l0.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) v.clone();
    }
    public Object ordinal() { return null; }
}
