package dz;

import com.github.service.models.response.ProjectV2OrderField;
import m10.lw;
import m10.mw;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mw.values().length];
        try {
            lw lwVar = mw.Companion;
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            lw lwVar2 = mw.Companion;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            lw lwVar3 = mw.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            lw lwVar4 = mw.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            lw lwVar5 = mw.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            lw lwVar6 = mw.Companion;
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            lw lwVar7 = mw.Companion;
            iArr[6] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[ProjectV2OrderField.values().length];
        try {
            iArr2[ProjectV2OrderField.RECENTLY_VIEWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ProjectV2OrderField.CREATED_AT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ProjectV2OrderField.NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ProjectV2OrderField.RELEVANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ProjectV2OrderField.TITLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ProjectV2OrderField.UPDATED_AT.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr2;
    }
}
