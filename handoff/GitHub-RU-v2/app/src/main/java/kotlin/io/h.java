package kotlin.io;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public static final h r;
    public static final /* synthetic */ h[] s;

    static {
        h hVar = new h("TOP_DOWN", 0);
        h hVar2 = new h("BOTTOM_UP", 1);
        r = hVar2;
        h[] hVarArr = {hVar, hVar2};
        s = hVarArr;
        l0.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) s.clone();
    }
}
