package com.github.rudroid.actions.checkdetail;

import android.content.Context;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class c1 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4655a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4656b;

        static {
            int[] iArr = new int[CheckConclusionState.values().length];
            try {
                iArr[CheckConclusionState.ACTION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckConclusionState.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckConclusionState.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckConclusionState.SKIPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckConclusionState.STALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckConclusionState.FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckConclusionState.SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckConclusionState.TIMED_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckConclusionState.STARTUP_FAILURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CheckConclusionState.UNKNOWN__.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f4655a = iArr;
            int[] iArr2 = new int[CheckStatusState.values().length];
            try {
                iArr2[CheckStatusState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CheckStatusState.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CheckStatusState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CheckStatusState.WAITING.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CheckStatusState.REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CheckStatusState.UNKNOWN__.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            f4656b = iArr2;
        }
    }

    public static final String a(w61.k kVar, Context context, int i, boolean z10) {
        w61.k kVar2;
        w61.k kVar3;
        w61.k kVar4;
        k71.k.g(context, "context");
        CheckConclusionState checkConclusionState = (CheckConclusionState) kVar.s;
        if (checkConclusionState != null) {
            switch (a.f4655a[checkConclusionState.ordinal()]) {
                case 1:
                    kVar2 = new w61.k(2131952764, 2131952763);
                    kVar3 = kVar2;
                    break;
                case 2:
                    kVar2 = new w61.k(2131952766, 2131952765);
                    kVar3 = kVar2;
                    break;
                case 3:
                    kVar2 = new w61.k(2131952774, 2131952773);
                    kVar3 = kVar2;
                    break;
                case 4:
                    kVar2 = new w61.k(2131952780, 2131952779);
                    kVar3 = kVar2;
                    break;
                case 5:
                    kVar2 = new w61.k(2131952782, 2131952781);
                    kVar3 = kVar2;
                    break;
                case 6:
                    kVar4 = new w61.k(2131952771, 2131952770);
                    kVar3 = kVar4;
                    break;
                case 7:
                    kVar3 = new w61.k(2131952785, 2131952784);
                    break;
                case 8:
                    kVar2 = new w61.k(2131951702, 2131951701);
                    kVar3 = kVar2;
                    break;
                case 9:
                    kVar4 = new w61.k(2131952771, 2131952770);
                    kVar3 = kVar4;
                    break;
                case 10:
                    kVar3 = new w61.k(2131952788, 2131952965);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            switch (a.f4656b[((CheckStatusState) kVar.r).ordinal()]) {
                case 1:
                    kVar2 = new w61.k(2131951688, 2131951687);
                    kVar3 = kVar2;
                    break;
                case 2:
                    kVar2 = new w61.k(2131951675, 2131951674);
                    kVar3 = kVar2;
                    break;
                case 3:
                    kVar3 = new w61.k(2131952785, 2131952784);
                    break;
                case 4:
                    kVar2 = new w61.k(2131951707, 2131951706);
                    kVar3 = kVar2;
                    break;
                case 5:
                    kVar2 = new w61.k(2131951690, 2131951689);
                    kVar3 = kVar2;
                    break;
                case 6:
                    kVar3 = new w61.k(2131952788, 2131952965);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        String string = i > 0 ? context.getString(((Number) kVar3.r).intValue(), com.github.rudroid.utilities.t.d(i, context, false)) : context.getString(((Number) kVar3.s).intValue());
        k71.k.d(string);
        if (!z10) {
            return string;
        }
        String string2 = context.getString(2131951888, string);
        k71.k.d(string2);
        return string2;
    }
}
