package jx0;

import com.github.service.models.response.ProjectV2OrderField;
import pz0.ar;
import pz0.br;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[br.values().length];
        try {
            ar arVar = br.Companion;
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ar arVar2 = br.Companion;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ar arVar3 = br.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ar arVar4 = br.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ar arVar5 = br.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ar arVar6 = br.Companion;
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            ar arVar7 = br.Companion;
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
