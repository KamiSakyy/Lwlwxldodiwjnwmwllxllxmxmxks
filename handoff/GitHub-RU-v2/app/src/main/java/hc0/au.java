package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class au {
    public static final zt Companion;
    public static final aa.a0 s;
    public static final au t;
    public static final /* synthetic */ au[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        au auVar = new au("FACEBOOK", 0, "FACEBOOK");
        au auVar2 = new au("GENERIC", 1, "GENERIC");
        au auVar3 = new au("HOMETOWN", 2, "HOMETOWN");
        au auVar4 = new au("INSTAGRAM", 3, "INSTAGRAM");
        au auVar5 = new au("LINKEDIN", 4, "LINKEDIN");
        au auVar6 = new au("MASTODON", 5, "MASTODON");
        au auVar7 = new au("REDDIT", 6, "REDDIT");
        au auVar8 = new au("TWITCH", 7, "TWITCH");
        au auVar9 = new au("TWITTER", 8, "TWITTER");
        au auVar10 = new au("YOUTUBE", 9, "YOUTUBE");
        au auVar11 = new au("UNKNOWN__", 10, "UNKNOWN__");
        t = auVar11;
        au[] auVarArr = {auVar, auVar2, auVar3, auVar4, auVar5, auVar6, auVar7, auVar8, auVar9, auVar10, auVar11};
        u = auVarArr;
        v = v8.l0.t(auVarArr);
        Companion = new zt();
        x61.l.r(new String[]{"FACEBOOK", "GENERIC", "HOMETOWN", "INSTAGRAM", "LINKEDIN", "MASTODON", "REDDIT", "TWITCH", "TWITTER", "YOUTUBE"});
        s = new aa.a0("SocialAccountProvider");
    }

    public au(String str, int i, String str2) {
        this.r = str2;
    }

    public static au valueOf(String str) {
        return (au) Enum.valueOf(au.class, str);
    }

    public static au[] values() {
        return (au[]) u.clone();
    }
}
