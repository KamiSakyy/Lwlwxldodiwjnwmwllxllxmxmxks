package ak;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final /* synthetic */ a[] E;
    public static final /* synthetic */ d71.b F;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public final String r;

    static {
        a aVar = new a("SCHEDULED_NOTIFICATIONS", 0, "scheduledNotifications");
        s = aVar;
        a aVar2 = new a("DIRECT_MENTIONS", 1, "getsDirsdfdsfectMentions");
        t = aVar2;
        a aVar3 = new a("REVIEW_REQUESTED", 2, "getsRedsfsdfviewRequests");
        u = aVar3;
        a aVar4 = new a("ASSIGNED", 3, "getsAssignments");
        v = aVar4;
        a aVar5 = new a("DEPLOYMENT_APPROVAL", 4, "getsDeploymentRequests");
        w = aVar5;
        a aVar6 = new a("PR_REVIEWED", 5, "getsPullRequestReviews");
        x = aVar6;
        a aVar7 = new a("MERGE_QUEUE_EVENTS", 6, "getsMergeQueueEvents");
        y = aVar7;
        a aVar8 = new a("CI_ACTIVITY", 7, "getsCiActivity");
        z = aVar8;
        a aVar9 = new a("CI_ACTIVITY_FAILED_ONLY", 8, "getsCiFailedOnly");
        A = aVar9;
        a aVar10 = new a("RELEASES_ACTIVITY", 9, "getsReleases");
        B = aVar10;
        a aVar11 = new a("LIVE_ACTIVITY_COPILOT_CODING_AGENT", 10, "getsLiveActivityCopilotCodingAgent");
        C = aVar11;
        a aVar12 = new a("STALE", 11, "stale");
        D = aVar12;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
        E = aVarArr;
        F = l0.t(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.r = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) E.clone();
    }
}
