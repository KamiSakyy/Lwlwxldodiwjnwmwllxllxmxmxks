package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ev {
    public static final /* synthetic */ d71.b A;
    public static final dv Companion;
    public static final aa.a0 s;
    public static final ev t;
    public static final ev u;
    public static final ev v;
    public static final ev w;
    public static final ev x;
    public static final ev y;
    public static final /* synthetic */ ev[] z;
    public final String r;

    static {
        ev evVar = new ev("CUSTOM", 0, "CUSTOM");
        t = evVar;
        ev evVar2 = new ev("IGNORED", 1, "IGNORED");
        u = evVar2;
        ev evVar3 = new ev("RELEASES_ONLY", 2, "RELEASES_ONLY");
        v = evVar3;
        ev evVar4 = new ev("SUBSCRIBED", 3, "SUBSCRIBED");
        w = evVar4;
        ev evVar5 = new ev("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        x = evVar5;
        ev evVar6 = new ev("UNKNOWN__", 5, "UNKNOWN__");
        y = evVar6;
        ev[] evVarArr = {evVar, evVar2, evVar3, evVar4, evVar5, evVar6};
        z = evVarArr;
        A = v8.l0.t(evVarArr);
        Companion = new dv();
        x61.l.r(new String[]{"CUSTOM", "IGNORED", "RELEASES_ONLY", "SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("SubscriptionState");
    }

    public ev(String str, int i, String str2) {
        this.r = str2;
    }

    public static ev valueOf(String str) {
        return (ev) Enum.valueOf(ev.class, str);
    }

    public static ev[] values() {
        return (ev[]) z.clone();
    }
}
