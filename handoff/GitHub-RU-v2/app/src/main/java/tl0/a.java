package tl0;

import com.github.service.models.response.home.NavLinkIdentifier;
import gn0.d10;
import gn0.e10;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[e10.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            d10 d10Var = e10.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            d10 d10Var2 = e10.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            d10 d10Var3 = e10.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            d10 d10Var4 = e10.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            d10 d10Var5 = e10.Companion;
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            d10 d10Var6 = e10.Companion;
            iArr[6] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            d10 d10Var7 = e10.Companion;
            iArr[7] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[NavLinkIdentifier.values().length];
        try {
            iArr2[NavLinkIdentifier.DISCUSSIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[NavLinkIdentifier.ISSUES.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[NavLinkIdentifier.ORGANIZATIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[NavLinkIdentifier.PROJECTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[NavLinkIdentifier.PULL_REQUESTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[NavLinkIdentifier.REPOSITORIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[NavLinkIdentifier.STARRED.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[NavLinkIdentifier.UNKNOWN__.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        a = iArr2;
    }
}
