package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ly {
    public static final ky Companion;
    public static final ly s;
    public static final ly t;
    public static final ly u;
    public static final ly v;
    public static final ly w;
    public static final ly x;
    public static final /* synthetic */ ly[] y;
    public static final /* synthetic */ d71.b z;
    public String r;

    static {
        ly lyVar = new ly("CREATED_AT", 0, "CREATED_AT");
        s = lyVar;
        ly lyVar2 = new ly("NAME", 1, "NAME");
        t = lyVar2;
        ly lyVar3 = new ly("PUSHED_AT", 2, "PUSHED_AT");
        u = lyVar3;
        ly lyVar4 = new ly("STARGAZERS", 3, "STARGAZERS");
        v = lyVar4;
        ly lyVar5 = new ly("UPDATED_AT", 4, "UPDATED_AT");
        w = lyVar5;
        ly lyVar6 = new ly("UNKNOWN__", 5, "UNKNOWN__");
        x = lyVar6;
        ly[] lyVarArr = {lyVar, lyVar2, lyVar3, lyVar4, lyVar5, lyVar6};
        y = lyVarArr;
        z = v8.l0.t(lyVarArr);
        Companion = new ky();
        sy.d0.o(new String[]{"CREATED_AT", "NAME", "PUSHED_AT", "STARGAZERS", "UPDATED_AT"});
    }

    public ly(String str, int i, String str2) {
        this.r = str2;
    }

    public static ly valueOf(String str) {
        return (ly) Enum.valueOf(ly.class, str);
    }

    public static ly[] values() {
        return (ly[]) y.clone();
    }
}
