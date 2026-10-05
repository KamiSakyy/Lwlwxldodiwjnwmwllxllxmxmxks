package com.github.rudroid.fragments;

import com.github.rudroid.settings.g3;
import com.github.service.models.response.type.MobileSubjectType;

/* loaded from: /home/user/work/p/classes.dex */
public final class e2 {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[com.github.rudroid.settings.g3.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                g3.a aVar = com.github.rudroid.settings.g3.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                g3.a aVar2 = com.github.rudroid.settings.g3.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                g3.a aVar3 = com.github.rudroid.settings.g3.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final MobileSubjectType a(o.b bVar) {
        return bVar instanceof yz0.q4 ? MobileSubjectType.ISSUE : bVar instanceof yz0.r4 ? MobileSubjectType.PULL_REQUEST : bVar instanceof yz0.s4 ? MobileSubjectType.RELEASE : bVar instanceof yz0.w4 ? MobileSubjectType.REPOSITORY_VULNERABILITY_ALERT : bVar instanceof yz0.n4 ? MobileSubjectType.COMMIT : bVar instanceof yz0.y4 ? MobileSubjectType.TEAM_DISCUSSION : bVar instanceof yz0.o4 ? MobileSubjectType.DISCUSSION : bVar instanceof yz0.p4 ? MobileSubjectType.GIST : bVar instanceof yz0.m4 ? MobileSubjectType.CHECK_SUITE : bVar instanceof yz0.a5 ? MobileSubjectType.WORKFLOW_RUN : bVar instanceof yz0.t4 ? MobileSubjectType.REPOSITORY_ADVISORY : bVar instanceof yz0.x4 ? MobileSubjectType.SECURITY_ADVISORY : bVar instanceof yz0.u4 ? MobileSubjectType.REPOSITORY_DEPENDABOT_THREAD_ALERT : MobileSubjectType.UNKNOWN__;
    }
}
