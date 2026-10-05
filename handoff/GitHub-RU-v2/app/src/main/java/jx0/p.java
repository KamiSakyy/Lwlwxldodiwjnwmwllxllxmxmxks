package jx0;

import com.github.service.models.response.shortcuts.ShortcutIcon;
import pz0.x00;
import pz0.y00;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class p {
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
            iArr[ShortcutIcon.TERMINAL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ShortcutIcon.TOOLS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ShortcutIcon.BEAKER.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ShortcutIcon.ALERT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ShortcutIcon.EYE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[ShortcutIcon.TELESCOPE.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[ShortcutIcon.BOOKMARK.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[ShortcutIcon.CALENDAR.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[ShortcutIcon.METER.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[ShortcutIcon.MOON.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[ShortcutIcon.SUN.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[ShortcutIcon.FLAME.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[ShortcutIcon.BUG.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[ShortcutIcon.NORTHSTAR.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[ShortcutIcon.ROCKET.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[ShortcutIcon.SQUIRREL.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[ShortcutIcon.HUBOT.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[ShortcutIcon.DEPENDABOT.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[ShortcutIcon.CLOCK.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[ShortcutIcon.MENTION.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[ShortcutIcon.SMILEY.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[ShortcutIcon.PERSON.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[ShortcutIcon.COMMENT.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[ShortcutIcon.COPILOT.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[ShortcutIcon.GLOBE.ordinal()] = 35;
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
        int[] iArr2 = new int[y00.values().length];
        try {
            x00 x00Var = y00.Companion;
            iArr2[30] = 1;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            x00 x00Var2 = y00.Companion;
            iArr2[16] = 2;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            x00 x00Var3 = y00.Companion;
            iArr2[14] = 3;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            x00 x00Var4 = y00.Companion;
            iArr2[9] = 4;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            x00 x00Var5 = y00.Companion;
            iArr2[21] = 5;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            x00 x00Var6 = y00.Companion;
            iArr2[22] = 6;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            x00 x00Var7 = y00.Companion;
            iArr2[3] = 7;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            x00 x00Var8 = y00.Companion;
            iArr2[12] = 8;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            x00 x00Var9 = y00.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            x00 x00Var10 = y00.Companion;
            iArr2[7] = 10;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            x00 x00Var11 = y00.Companion;
            iArr2[28] = 11;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            x00 x00Var12 = y00.Companion;
            iArr2[29] = 12;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            x00 x00Var13 = y00.Companion;
            iArr2[1] = 13;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            x00 x00Var14 = y00.Companion;
            iArr2[0] = 14;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            x00 x00Var15 = y00.Companion;
            iArr2[11] = 15;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            x00 x00Var16 = y00.Companion;
            iArr2[27] = 16;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            x00 x00Var17 = y00.Companion;
            iArr2[2] = 17;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            x00 x00Var18 = y00.Companion;
            iArr2[5] = 18;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            x00 x00Var19 = y00.Companion;
            iArr2[18] = 19;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            x00 x00Var20 = y00.Companion;
            iArr2[19] = 20;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            x00 x00Var21 = y00.Companion;
            iArr2[26] = 21;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            x00 x00Var22 = y00.Companion;
            iArr2[13] = 22;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            x00 x00Var23 = y00.Companion;
            iArr2[4] = 23;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            x00 x00Var24 = y00.Companion;
            iArr2[20] = 24;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            x00 x00Var25 = y00.Companion;
            iArr2[23] = 25;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            x00 x00Var26 = y00.Companion;
            iArr2[25] = 26;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            x00 x00Var27 = y00.Companion;
            iArr2[15] = 27;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            x00 x00Var28 = y00.Companion;
            iArr2[10] = 28;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            x00 x00Var29 = y00.Companion;
            iArr2[6] = 29;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            x00 x00Var30 = y00.Companion;
            iArr2[17] = 30;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            x00 x00Var31 = y00.Companion;
            iArr2[24] = 31;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            x00 x00Var32 = y00.Companion;
            iArr2[31] = 32;
        } catch (NoSuchFieldError unused77) {
        }
        b = iArr2;
    }
}
