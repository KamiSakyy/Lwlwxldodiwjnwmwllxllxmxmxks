package bm;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final h r;
    public static final /* synthetic */ h[] s;
    public static final /* synthetic */ d71.b t;

    static {
        h hVar = new h("Created", 0);
        r = hVar;
        h[] hVarArr = {hVar, new h("Commented", 1)};
        s = hVarArr;
        t = l0.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) s.clone();
    }
}
