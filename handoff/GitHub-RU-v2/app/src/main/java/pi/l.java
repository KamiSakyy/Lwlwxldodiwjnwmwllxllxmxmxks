package pi;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final k Companion;
    public static final l s;
    public static final l t;
    public static final l u;
    public static final /* synthetic */ l[] v;
    public String r;

    static {
        l lVar = new l("COMMAND", 0, "command");
        l lVar2 = new l("DEBUG", 1, "debug");
        l lVar3 = new l("ERROR", 2, "error");
        s = lVar3;
        l lVar4 = new l("INFO", 3, "info");
        l lVar5 = new l("SECTION", 4, "section");
        l lVar6 = new l("VERBOSE", 5, "verbose");
        l lVar7 = new l("WARNING", 6, "warning");
        l lVar8 = new l("GROUP", 7, "group");
        t = lVar8;
        l lVar9 = new l("ENDGROUP", 8, "endgroup");
        u = lVar9;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, new l("ICON", 9, "icon"), new l("NOTICE", 10, "notice")};
        v = lVarArr;
        l0.t(lVarArr);
        Companion = new k();
    }

    public l(String str, int i, String str2) {
        this.r = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) v.clone();
    }
}
