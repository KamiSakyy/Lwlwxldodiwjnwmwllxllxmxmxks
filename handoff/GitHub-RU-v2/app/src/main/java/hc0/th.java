package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class th {
    public static final sh Companion;
    public static final aa.a0 s;
    public static final th t;
    public static final /* synthetic */ th[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        th thVar = new th("LIST_IGNORED", 0, "LIST_IGNORED");
        th thVar2 = new th("LIST_SUBSCRIBED", 1, "LIST_SUBSCRIBED");
        th thVar3 = new th("THREAD_SUBSCRIBED", 2, "THREAD_SUBSCRIBED");
        th thVar4 = new th("THREAD_TYPE_SUBSCRIBED", 3, "THREAD_TYPE_SUBSCRIBED");
        th thVar5 = new th("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        th thVar6 = new th("UNKNOWN__", 5, "UNKNOWN__");
        t = thVar6;
        th[] thVarArr = {thVar, thVar2, thVar3, thVar4, thVar5, thVar6};
        u = thVarArr;
        v = v8.l0.t(thVarArr);
        Companion = new sh();
        x61.l.r(new String[]{"LIST_IGNORED", "LIST_SUBSCRIBED", "THREAD_SUBSCRIBED", "THREAD_TYPE_SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("NotificationThreadSubscriptionState");
    }

    public th(String str, int i, String str2) {
        this.r = str2;
    }

    public static th valueOf(String str) {
        return (th) Enum.valueOf(th.class, str);
    }

    public static th[] values() {
        return (th[]) u.clone();
    }
}
