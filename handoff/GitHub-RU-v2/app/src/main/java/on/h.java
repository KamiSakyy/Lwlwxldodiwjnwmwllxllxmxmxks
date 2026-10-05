package on;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final /* synthetic */ h[] r;

    static {
        h[] hVarArr = {new h("LAST_UPDATED_AT", 0)};
        r = hVarArr;
        l0.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) r.clone();
    }
}
