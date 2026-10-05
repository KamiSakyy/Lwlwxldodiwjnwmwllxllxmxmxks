package v01;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final d r;
    public static final /* synthetic */ d[] s;
    public static final /* synthetic */ d71.b t;

    static {
        d dVar = new d("ALL", 0);
        r = dVar;
        d[] dVarArr = {dVar, new d("ARCHIVED", 1), new d("FORK", 2), new d("MIRROR", 3), new d("PRIVATE", 4), new d("PUBLIC", 5), new d("SOURCE", 6), new d("TEMPLATE", 7)};
        s = dVarArr;
        t = l0.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) s.clone();
    }

    public d(Object... a) {
    }
}
