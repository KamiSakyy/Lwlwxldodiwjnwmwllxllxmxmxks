package com.github.rudroid.createissue.propertybar.tooltips;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: r, reason: collision with root package name */
    public static final a f10497r;

    /* renamed from: s, reason: collision with root package name */
    public static final a f10498s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f10499t;

    static {
        a aVar = new a("CODING_AGENT_ASSIGNMENT", 0);
        f10497r = aVar;
        a aVar2 = new a("CODING_AGENT_CUSTOM_INSTRUCTIONS", 1);
        f10498s = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f10499t = aVarArr;
        l0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10499t.clone();
    }
    public Object ordinal() { return null; }
}
