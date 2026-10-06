package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ua {
    public static final ua A;
    public static final /* synthetic */ ua[] B;
    public static final /* synthetic */ d71.b C;
    public static final ta Companion;
    public static final aa.a0 s;
    public static final ua t;
    public static final ua u;
    public static final ua v;
    public static final ua w;
    public static final ua x;
    public static final ua y;
    public static final ua z;
    public String r;

    static {
        ua uaVar = new ua("FRIDAY", 0, "FRIDAY");
        t = uaVar;
        ua uaVar2 = new ua("MONDAY", 1, "MONDAY");
        u = uaVar2;
        ua uaVar3 = new ua("SATURDAY", 2, "SATURDAY");
        v = uaVar3;
        ua uaVar4 = new ua("SUNDAY", 3, "SUNDAY");
        w = uaVar4;
        ua uaVar5 = new ua("THURSDAY", 4, "THURSDAY");
        x = uaVar5;
        ua uaVar6 = new ua("TUESDAY", 5, "TUESDAY");
        y = uaVar6;
        ua uaVar7 = new ua("WEDNESDAY", 6, "WEDNESDAY");
        z = uaVar7;
        ua uaVar8 = new ua("UNKNOWN__", 7, "UNKNOWN__");
        A = uaVar8;
        ua[] uaVarArr = {uaVar, uaVar2, uaVar3, uaVar4, uaVar5, uaVar6, uaVar7, uaVar8};
        B = uaVarArr;
        C = v8.l0.t(uaVarArr);
        Companion = new ta();
        x61.l.r(new String[]{"FRIDAY", "MONDAY", "SATURDAY", "SUNDAY", "THURSDAY", "TUESDAY", "WEDNESDAY"});
        s = new aa.a0("DayOfWeek");
    }

    public ua(String str, int i, String str2) {
        this.r = str2;
    }

    public static ua valueOf(String str) {
        return (ua) Enum.valueOf(ua.class, str);
    }

    public static ua[] values() {
        return (ua[]) B.clone();
    }
}
