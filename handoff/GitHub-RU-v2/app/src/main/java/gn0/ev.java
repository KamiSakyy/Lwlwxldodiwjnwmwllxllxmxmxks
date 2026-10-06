package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ev {
    public static final dv Companion;
    public static final aa.a0 s;
    public static final ev t;
    public static final /* synthetic */ ev[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        ev evVar = new ev("FACEBOOK", 0, "FACEBOOK");
        ev evVar2 = new ev("GENERIC", 1, "GENERIC");
        ev evVar3 = new ev("HOMETOWN", 2, "HOMETOWN");
        ev evVar4 = new ev("INSTAGRAM", 3, "INSTAGRAM");
        ev evVar5 = new ev("LINKEDIN", 4, "LINKEDIN");
        ev evVar6 = new ev("MASTODON", 5, "MASTODON");
        ev evVar7 = new ev("NPM", 6, "NPM");
        ev evVar8 = new ev("REDDIT", 7, "REDDIT");
        ev evVar9 = new ev("TWITCH", 8, "TWITCH");
        ev evVar10 = new ev("TWITTER", 9, "TWITTER");
        ev evVar11 = new ev("YOUTUBE", 10, "YOUTUBE");
        ev evVar12 = new ev("UNKNOWN__", 11, "UNKNOWN__");
        t = evVar12;
        ev[] evVarArr = {evVar, evVar2, evVar3, evVar4, evVar5, evVar6, evVar7, evVar8, evVar9, evVar10, evVar11, evVar12};
        u = evVarArr;
        v = v8.l0.t(evVarArr);
        Companion = new dv();
        x61.l.r(new String[]{"FACEBOOK", "GENERIC", "HOMETOWN", "INSTAGRAM", "LINKEDIN", "MASTODON", "NPM", "REDDIT", "TWITCH", "TWITTER", "YOUTUBE"});
        s = new aa.a0("SocialAccountProvider");
    }

    public ev(String str, int i, String str2) {
        this.r = str2;
    }

    public static ev valueOf(String str) {
        return (ev) Enum.valueOf(ev.class, str);
    }

    public static ev[] values() {
        return (ev[]) u.clone();
    }
}
