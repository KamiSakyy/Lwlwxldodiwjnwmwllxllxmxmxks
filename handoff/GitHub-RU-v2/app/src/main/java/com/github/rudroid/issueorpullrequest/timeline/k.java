package com.github.rudroid.issueorpullrequest.timeline;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16148a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16149b;

        static {
            int[] iArr = new int[CloseReason.values().length];
            try {
                iArr[CloseReason.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloseReason.NotPlanned.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CloseReason.Duplicate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16148a = iArr;
            int[] iArr2 = new int[IssueState.values().length];
            try {
                iArr2[IssueState.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IssueState.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IssueState.UNKNOWN__.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f16149b = iArr2;
        }
    }
}
