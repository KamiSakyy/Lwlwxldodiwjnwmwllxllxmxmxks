package com.github.rudroid.common;

import com.github.rudroid.common.f;
import java.time.DayOfWeek;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9315a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f.a aVar = f.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f.a aVar2 = f.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f.a aVar3 = f.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f.a aVar4 = f.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f.a aVar5 = f.Companion;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f.a aVar6 = f.Companion;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[DayOfWeek.values().length];
            try {
                iArr2[DayOfWeek.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DayOfWeek.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DayOfWeek.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DayOfWeek.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DayOfWeek.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DayOfWeek.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DayOfWeek.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            f9315a = iArr2;
        }
    }

    public static final int a(f fVar) {
        k71.k.g(fVar, "<this>");
        switch (fVar.ordinal()) {
            case k5.f.J /* 0 */:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
