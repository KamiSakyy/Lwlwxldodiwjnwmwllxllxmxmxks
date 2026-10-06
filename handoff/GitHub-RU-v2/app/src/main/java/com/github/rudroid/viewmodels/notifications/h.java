package com.github.rudroid.viewmodels.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final h r;
    public static final h s;
    public static final h t;
    public static final h u;
    public static final h v;
    public static final h w;
    public static final h x;
    public static final h y;
    public static final /* synthetic */ h[] z;

    static {
        h hVar = new h("MARK_AS_READ", 0);
        r = hVar;
        h hVar2 = new h("MARK_AS_UNREAD", 1);
        s = hVar2;
        h hVar3 = new h("MARK_AS_DONE", 2);
        t = hVar3;
        h hVar4 = new h("MARK_AS_UNDONE", 3);
        u = hVar4;
        h hVar5 = new h("MARK_AS_SAVED", 4);
        v = hVar5;
        h hVar6 = new h("MARK_AS_UNSAVED", 5);
        w = hVar6;
        h hVar7 = new h("UNSUBSCRIBED", 6);
        x = hVar7;
        h hVar8 = new h("SUBSCRIBED", 7);
        y = hVar8;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8};
        z = hVarArr;
        v8.l0.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) z.clone();
    }
    public Object Q(Object p1, Object p2, Object p3) { return null; }
    public Object R(Object p1) { return null; }
}
