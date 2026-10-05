package bm;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final j r;
    public static final /* synthetic */ j[] s;
    public static final /* synthetic */ d71.b t;

    static {
        j jVar = new j("New", 0);
        r = jVar;
        j[] jVarArr = {jVar, new j("TopAll", 1), new j("TopYesterday", 2), new j("TopPastWeek", 3), new j("TopPastMonth", 4), new j("TopPastYear", 5)};
        s = jVarArr;
        t = l0.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) s.clone();
    }
}
