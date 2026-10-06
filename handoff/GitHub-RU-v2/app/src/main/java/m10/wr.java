package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class wr {
    public static final vr Companion;
    public static final aa.a0 s;
    public static final wr t;
    public static final /* synthetic */ wr[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        wr wrVar = new wr("ADDED", 0, "ADDED");
        wr wrVar2 = new wr("CHANGED", 1, "CHANGED");
        wr wrVar3 = new wr("COPIED", 2, "COPIED");
        wr wrVar4 = new wr("DELETED", 3, "DELETED");
        wr wrVar5 = new wr("MODIFIED", 4, "MODIFIED");
        wr wrVar6 = new wr("RENAMED", 5, "RENAMED");
        wr wrVar7 = new wr("UNKNOWN__", 6, "UNKNOWN__");
        t = wrVar7;
        wr[] wrVarArr = {wrVar, wrVar2, wrVar3, wrVar4, wrVar5, wrVar6, wrVar7};
        u = wrVarArr;
        v = v8.l0.t(wrVarArr);
        Companion = new vr();
        x61.l.r(new String[]{"ADDED", "CHANGED", "COPIED", "DELETED", "MODIFIED", "RENAMED"});
        s = new aa.a0("PatchStatus");
    }

    public wr(String str, int i, String str2) {
        this.r = str2;
    }

    public static wr valueOf(String str) {
        return (wr) Enum.valueOf(wr.class, str);
    }

    public static wr[] values() {
        return (wr[]) u.clone();
    }
}
