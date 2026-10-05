package sn;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final /* synthetic */ a[] r;

    static {
        a[] aVarArr = {new a("CLOSE_REFERENCES", 0), new a("STATE", 1), new a("TIMELINE", 2), new a("UPDATED", 3)};
        r = aVarArr;
        l0.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) r.clone();
    }
}
