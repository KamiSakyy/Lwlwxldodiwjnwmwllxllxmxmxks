package gz;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final c r;
    public static final /* synthetic */ c[] s;

    static {
        c cVar = new c("ENABLED", 0);
        c cVar2 = new c("UNCONFIGURED", 1);
        r = cVar2;
        c[] cVarArr = {cVar, cVar2, new c("DISABLED", 2)};
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
