package com.github.rudroid.settings.featurepreview;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements ei.a {
    public static final c r;
    public static final /* synthetic */ c[] s;

    static {
        ei.d dVar = ei.d.s;
        c cVar = new c("STAFF_BANNER", 0);
        r = cVar;
        c[] cVarArr = {cVar};
        s = cVarArr;
        l0.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) s.clone();
    }
}
