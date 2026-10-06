package com.github.rudroid.shortcuts;

import android.content.Context;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.github.service.models.response.type.MobileSubjectType;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ShortcutColor.values().length];
            try {
                iArr[ShortcutColor.GRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortcutColor.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortcutColor.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShortcutColor.ORANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShortcutColor.RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShortcutColor.PINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShortcutColor.PURPLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
            int[] iArr2 = new int[ShortcutIcon.values().length];
            try {
                iArr2[ShortcutIcon.ZAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ShortcutIcon.ISSUEOPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ShortcutIcon.GITPULLREQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ShortcutIcon.COMMENTDISCUSSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ShortcutIcon.ORGANIZATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ShortcutIcon.PEOPLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ShortcutIcon.BRIEFCASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ShortcutIcon.FILEDIFF.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ShortcutIcon.CODEREVIEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ShortcutIcon.CODESCAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ShortcutIcon.TERMINAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ShortcutIcon.TOOLS.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ShortcutIcon.BEAKER.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ShortcutIcon.ALERT.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[ShortcutIcon.EYE.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[ShortcutIcon.TELESCOPE.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[ShortcutIcon.BOOKMARK.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[ShortcutIcon.CALENDAR.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[ShortcutIcon.METER.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[ShortcutIcon.MOON.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[ShortcutIcon.SUN.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[ShortcutIcon.FLAME.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[ShortcutIcon.BUG.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[ShortcutIcon.NORTHSTAR.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[ShortcutIcon.ROCKET.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[ShortcutIcon.SQUIRREL.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[ShortcutIcon.HUBOT.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[ShortcutIcon.DEPENDABOT.ordinal()] = 28;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[ShortcutIcon.CLOCK.ordinal()] = 29;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[ShortcutIcon.MENTION.ordinal()] = 30;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[ShortcutIcon.SMILEY.ordinal()] = 31;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[ShortcutIcon.PERSON.ordinal()] = 32;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[ShortcutIcon.INBOX.ordinal()] = 33;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[ShortcutIcon.ARCHIVE.ordinal()] = 34;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[ShortcutIcon.GEAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[ShortcutIcon.HOME.ordinal()] = 36;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[ShortcutIcon.LINK.ordinal()] = 37;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[ShortcutIcon.REPO.ordinal()] = 38;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[ShortcutIcon.REPO_FORKED.ordinal()] = 39;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[ShortcutIcon.REPO_LOCKED.ordinal()] = 40;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[ShortcutIcon.REPO_TEMPLATE.ordinal()] = 41;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[ShortcutIcon.STAR.ordinal()] = 42;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[ShortcutIcon.COMMENT.ordinal()] = 43;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[ShortcutIcon.COPILOT.ordinal()] = 44;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[ShortcutIcon.GLOBE.ordinal()] = 45;
            } catch (NoSuchFieldError unused52) {
            }
            b = iArr2;
            int[] iArr3 = new int[ShortcutType.values().length];
            try {
                iArr3[ShortcutType.ISSUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr3[ShortcutType.PULL_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr3[ShortcutType.DISCUSSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr3[ShortcutType.REPOSITORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused56) {
            }
            c = iArr3;
        }
    }

    public static final int a(ShortcutColor shortcutColor) {
        k71.k.g(shortcutColor, "<this>");
        switch (a.a[shortcutColor.ordinal()]) {
            case 1:
                return 2131953689;
            case 2:
                return 2131953688;
            case 3:
                return 2131953690;
            case 4:
                return 2131953691;
            case 5:
                return 2131953694;
            case 6:
                return 2131953692;
            case 7:
                return 2131953693;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String b(wm.b bVar, Context context) {
        String string;
        k71.k.g(bVar, "<this>");
        String name = bVar.getName();
        com.github.service.models.response.shortcuts.a i = bVar.i();
        if (i instanceof ShortcutScope.AllRepositories) {
            string = context.getString(2131954131, h(bVar.K(), context));
        } else {
            if (!(i instanceof ShortcutScope.SpecificRepository)) {
                throw new NoWhenBranchMatchedException();
            }
            string = context.getString(2131954132, h(bVar.K(), context), i(bVar.i(), context, bVar.K()));
        }
        k71.k.d(string);
        String string2 = context.getString(2131954129, context.getString(a(bVar.f())), w8.s.m(bVar.getIcon()));
        k71.k.f(string2, "getString(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(": ");
        sb.append(string);
        return h1.p(sb, " ", string2);
    }

    public static final MobileSubjectType c(wm.b bVar) {
        k71.k.g(bVar, "<this>");
        int i = a.c[bVar.K().ordinal()];
        if (i == 1) {
            return MobileSubjectType.ISSUE;
        }
        if (i == 2) {
            return MobileSubjectType.PULL_REQUEST;
        }
        if (i == 3) {
            return MobileSubjectType.DISCUSSION;
        }
        if (i == 4) {
            return MobileSubjectType.REPOSITORY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int d(ShortcutColor shortcutColor) {
        k71.k.g(shortcutColor, "<this>");
        switch (a.a[shortcutColor.ordinal()]) {
            case 1:
                return 2131100962;
            case 2:
                return 2131100961;
            case 3:
                return 2131100963;
            case 4:
                return 2131100964;
            case 5:
                return 2131100967;
            case 6:
                return 2131100965;
            case 7:
                return 2131100966;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int e(ShortcutIcon shortcutIcon) {
        k71.k.g(shortcutIcon, "<this>");
        switch (a.b[shortcutIcon.ordinal()]) {
            case 1:
                return 2131231505;
            case 2:
                return 2131231327;
            case 3:
                return 2131231290;
            case 4:
                return 2131231201;
            case 5:
                return 2131231385;
            case 6:
                return 2131231394;
            case 7:
                return 2131231147;
            case 8:
                return 2131231265;
            case 9:
                return 2131231192;
            case 10:
                return 2131231195;
            case 11:
                return 2131231470;
            case 12:
                return 2131231477;
            case 13:
                return 2131231122;
            case 14:
                return 2131231103;
            case 15:
                return 2131231247;
            case 16:
                return 2131231467;
            case 17:
                return 2131231138;
            case 18:
                return 2131231150;
            case 19:
                return 2131231367;
            case 20:
                return 2131231371;
            case 21:
                return 2131231461;
            case 22:
                return 2131231274;
            case 23:
                return 2131231148;
            case 24:
                return 2131231378;
            case 25:
                return 2131231429;
            case 26:
                return 2131231454;
            case 27:
                return 2131231312;
            case 28:
                return 2131231215;
            case 29:
                return 2131231185;
            case 30:
                return 2131231365;
            case 31:
                return 2131231449;
            case 32:
                return 2131231395;
            case 33:
                return 2131231315;
            case 34:
                return 2131231109;
            case 35:
                return 2131231278;
            case 36:
                return 2131231309;
            case 37:
                return 2131231345;
            case 38:
                return 2131231418;
            case 39:
                return 2131231420;
            case 40:
                return 2131231421;
            case 41:
                return 2131231423;
            case 42:
                return 2131231455;
            case 43:
                return 2131231198;
            case 44:
                return 2131231205;
            case 45:
                return 2131231300;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int f(ShortcutColor shortcutColor) {
        k71.k.g(shortcutColor, "<this>");
        switch (a.a[shortcutColor.ordinal()]) {
            case 1:
                return 2131100969;
            case 2:
                return 2131100968;
            case 3:
                return 2131100970;
            case 4:
                return 2131100971;
            case 5:
                return 2131100974;
            case 6:
                return 2131100972;
            case 7:
                return 2131100973;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String g(com.github.service.models.response.shortcuts.a aVar, Context context) {
        k71.k.g(aVar, "<this>");
        k71.k.g(context, "context");
        if (!(aVar instanceof ShortcutScope.SpecificRepository)) {
            String string = context.getString(2131954633);
            k71.k.d(string);
            return string;
        }
        ShortcutScope.SpecificRepository specificRepository = (ShortcutScope.SpecificRepository) aVar;
        String string2 = context.getString(2131954770, specificRepository.s, specificRepository.t);
        k71.k.d(string2);
        return string2;
    }

    public static final String h(ShortcutType shortcutType, Context context) {
        k71.k.g(shortcutType, "<this>");
        k71.k.g(context, "context");
        int i = a.c[shortcutType.ordinal()];
        if (i == 1) {
            String string = context.getString(2131954638);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (i == 2) {
            String string2 = context.getString(2131954639);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (i == 3) {
            String string3 = context.getString(2131954637);
            k71.k.f(string3, "getString(...)");
            return string3;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = context.getString(2131954640);
        k71.k.f(string4, "getString(...)");
        return string4;
    }

    public static final String i(com.github.service.models.response.shortcuts.a aVar, Context context, ShortcutType shortcutType) {
        k71.k.g(aVar, "<this>");
        k71.k.g(context, "context");
        k71.k.g(shortcutType, "type");
        if (aVar.equals(ShortcutScope.AllRepositories.INSTANCE)) {
            return h(shortcutType, context);
        }
        if (aVar instanceof ShortcutScope.SpecificRepository) {
            return g(aVar, context);
        }
        throw new NoWhenBranchMatchedException();
    }
}
