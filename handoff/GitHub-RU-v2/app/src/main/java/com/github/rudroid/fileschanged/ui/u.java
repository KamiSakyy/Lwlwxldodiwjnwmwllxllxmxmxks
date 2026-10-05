package com.github.rudroid.fileschanged.ui;

import com.github.service.models.response.type.DiffLineType;

/* loaded from: /home/user/work/p/classes.dex */
public final class u {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13574a;

        static {
            int[] iArr = new int[DiffLineType.values().length];
            try {
                iArr[DiffLineType.ADDITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiffLineType.DELETION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiffLineType.HUNK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DiffLineType.CONTEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DiffLineType.INJECTED_CONTEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13574a = iArr;
        }
    }
}
