package dz;

import com.github.service.models.response.shortcuts.ShortcutIcon;
import m10.x60;
import m10.y60;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ShortcutIcon.values().length];
        try {
            iArr[ShortcutIcon.ZAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShortcutIcon.ISSUEOPENED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShortcutIcon.GITPULLREQUEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShortcutIcon.COMMENTDISCUSSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ShortcutIcon.ORGANIZATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ShortcutIcon.PEOPLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ShortcutIcon.BRIEFCASE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ShortcutIcon.FILEDIFF.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ShortcutIcon.CODEREVIEW.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ShortcutIcon.CODESCAN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ShortcutIcon.COMMENT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ShortcutIcon.COPILOT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ShortcutIcon.TERMINAL.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ShortcutIcon.TOOLS.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ShortcutIcon.BEAKER.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[ShortcutIcon.ALERT.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[ShortcutIcon.EYE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[ShortcutIcon.TELESCOPE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[ShortcutIcon.BOOKMARK.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[ShortcutIcon.CALENDAR.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[ShortcutIcon.METER.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[ShortcutIcon.MOON.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[ShortcutIcon.SUN.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[ShortcutIcon.FLAME.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[ShortcutIcon.GLOBE.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[ShortcutIcon.BUG.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[ShortcutIcon.NORTHSTAR.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[ShortcutIcon.ROCKET.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[ShortcutIcon.SQUIRREL.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[ShortcutIcon.HUBOT.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[ShortcutIcon.DEPENDABOT.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[ShortcutIcon.CLOCK.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[ShortcutIcon.MENTION.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[ShortcutIcon.SMILEY.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[ShortcutIcon.PERSON.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[ShortcutIcon.ARCHIVE.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[ShortcutIcon.GEAR.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[ShortcutIcon.HOME.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[ShortcutIcon.INBOX.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[ShortcutIcon.LINK.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[ShortcutIcon.REPO.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[ShortcutIcon.REPO_FORKED.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[ShortcutIcon.REPO_LOCKED.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[ShortcutIcon.REPO_TEMPLATE.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[ShortcutIcon.STAR.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        a = iArr;
        int[] iArr2 = new int[y60.values().length];
        try {
            x60 x60Var = y60.Companion;
            iArr2[44] = 1;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            x60 x60Var2 = y60.Companion;
            iArr2[23] = 2;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            x60 x60Var3 = y60.Companion;
            iArr2[18] = 3;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            x60 x60Var4 = y60.Companion;
            iArr2[11] = 4;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            x60 x60Var5 = y60.Companion;
            iArr2[29] = 5;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            x60 x60Var6 = y60.Companion;
            iArr2[30] = 6;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            x60 x60Var7 = y60.Companion;
            iArr2[4] = 7;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            x60 x60Var8 = y60.Companion;
            iArr2[15] = 8;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            x60 x60Var9 = y60.Companion;
            iArr2[9] = 9;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            x60 x60Var10 = y60.Companion;
            iArr2[8] = 10;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            x60 x60Var11 = y60.Companion;
            iArr2[42] = 11;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            x60 x60Var12 = y60.Companion;
            iArr2[43] = 12;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            x60 x60Var13 = y60.Companion;
            iArr2[2] = 13;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            x60 x60Var14 = y60.Companion;
            iArr2[0] = 14;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            x60 x60Var15 = y60.Companion;
            iArr2[14] = 15;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            x60 x60Var16 = y60.Companion;
            iArr2[41] = 16;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            x60 x60Var17 = y60.Companion;
            iArr2[3] = 17;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            x60 x60Var18 = y60.Companion;
            iArr2[6] = 18;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            x60 x60Var19 = y60.Companion;
            iArr2[26] = 19;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            x60 x60Var20 = y60.Companion;
            iArr2[27] = 20;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            x60 x60Var21 = y60.Companion;
            iArr2[40] = 21;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            x60 x60Var22 = y60.Companion;
            iArr2[16] = 22;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            x60 x60Var23 = y60.Companion;
            iArr2[5] = 23;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            x60 x60Var24 = y60.Companion;
            iArr2[28] = 24;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            x60 x60Var25 = y60.Companion;
            iArr2[36] = 25;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            x60 x60Var26 = y60.Companion;
            iArr2[38] = 26;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            x60 x60Var27 = y60.Companion;
            iArr2[21] = 27;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            x60 x60Var28 = y60.Companion;
            iArr2[13] = 28;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            x60 x60Var29 = y60.Companion;
            iArr2[7] = 29;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            x60 x60Var30 = y60.Companion;
            iArr2[25] = 30;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            x60 x60Var31 = y60.Companion;
            iArr2[37] = 31;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            x60 x60Var32 = y60.Companion;
            iArr2[45] = 32;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            x60 x60Var33 = y60.Companion;
            iArr2[31] = 33;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            x60 x60Var34 = y60.Companion;
            iArr2[1] = 34;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            x60 x60Var35 = y60.Companion;
            iArr2[17] = 35;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            x60 x60Var36 = y60.Companion;
            iArr2[20] = 36;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            x60 x60Var37 = y60.Companion;
            iArr2[22] = 37;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            x60 x60Var38 = y60.Companion;
            iArr2[24] = 38;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            x60 x60Var39 = y60.Companion;
            iArr2[32] = 39;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            x60 x60Var40 = y60.Companion;
            iArr2[33] = 40;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            x60 x60Var41 = y60.Companion;
            iArr2[34] = 41;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            x60 x60Var42 = y60.Companion;
            iArr2[35] = 42;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            x60 x60Var43 = y60.Companion;
            iArr2[39] = 43;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            x60 x60Var44 = y60.Companion;
            iArr2[10] = 44;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            x60 x60Var45 = y60.Companion;
            iArr2[12] = 45;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            x60 x60Var46 = y60.Companion;
            iArr2[19] = 46;
        } catch (NoSuchFieldError unused91) {
        }
        b = iArr2;
    }
}
