package yf;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final a Companion;
    public static final c s;
    public static final /* synthetic */ c[] t;
    public static final /* synthetic */ d71.b u;
    public int r;

    public static final class a {
    }

    static {
        c cVar = new c(0, "IMMEDIATELY", 0);
        s = cVar;
        c[] cVarArr = {cVar, new c(1, "AFTER_1_MINUTE", 1), new c(2, "AFTER_2_MINUTES", 2), new c(3, "AFTER_5_MINUTES", 5), new c(4, "AFTER_30_MINUTES", 30)};
        t = cVarArr;
        u = l0.t(cVarArr);
        Companion = new a();
    }

    public c(int i, String str, int i2) {
        this.r = i2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) t.clone();
    }
}
