package com.github.rudroid.draft.ui;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: r, reason: collision with root package name */
    public static final i f12142r;

    /* renamed from: s, reason: collision with root package name */
    public static final i f12143s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f12144t;

    /* renamed from: u, reason: collision with root package name */
    public static final i f12145u;

    /* renamed from: v, reason: collision with root package name */
    public static final i f12146v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ i[] f12147w;

    static {
        i iVar = new i("INITIAL", 0);
        f12142r = iVar;
        i iVar2 = new i("DROPDOWN_MENU", 1);
        f12143s = iVar2;
        i iVar3 = new i("EDIT_TITLE", 2);
        f12144t = iVar3;
        i iVar4 = new i("DELETE_FROM_PROJECT", 3);
        f12145u = iVar4;
        i iVar5 = new i("FINISHED", 4);
        f12146v = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        f12147w = iVarArr;
        l0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f12147w.clone();
    }
}
