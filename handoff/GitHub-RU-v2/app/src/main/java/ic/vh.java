package ic;

import android.content.Context;
import android.widget.TextView;
import com.github.service.models.response.InteractionType;
import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class vh {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26238a;

        static {
            int[] iArr = new int[InteractionType.values().length];
            try {
                iArr[InteractionType.ASSIGNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InteractionType.AUTHORED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InteractionType.REOPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InteractionType.COMMENTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InteractionType.COMMENT_EDITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InteractionType.REVIEW_RECEIVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InteractionType.REVIEW_REQUESTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InteractionType.DEPLOYED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InteractionType.REFERENCED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InteractionType.RECEIVED_COMMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InteractionType.RECEIVED_COMMENT_EDITED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f26238a = iArr;
        }
    }

    public static String a(int i, Context context, boolean z10) {
        String string = z10 ? context.getString(2131952411, Integer.valueOf(i)) : context.getString(2131952410, Integer.valueOf(i));
        k71.k.d(string);
        return string;
    }

    public static String b(int i, Context context, boolean z10) {
        String quantityString = z10 ? context.getResources().getQuantityString(2131820564, i, Integer.valueOf(i)) : context.getResources().getQuantityString(2131820563, i, Integer.valueOf(i));
        k71.k.d(quantityString);
        return quantityString;
    }

    public static String c(Context context, int i) {
        k71.k.g(context, "context");
        if (i < 0) {
            return "";
        }
        if (i == 0) {
            return l(context, 0);
        }
        Duration ofSeconds = Duration.ofSeconds(i);
        long days = ofSeconds.toDays();
        long j10 = 24 * days;
        long hours = ofSeconds.toHours() - j10;
        long j11 = 60;
        long j12 = j10 * j11;
        long j13 = hours * j11;
        long minutes = (ofSeconds.toMinutes() - j12) - j13;
        long seconds = ((ofSeconds.getSeconds() - (j12 * j11)) - (j13 * j11)) - (j11 * minutes);
        StringBuilder sb2 = new StringBuilder();
        if (days > 0) {
            sb2.append(b((int) days, context, false));
        }
        if (hours > 0) {
            sb2.append(" ".concat(f((int) hours, context, false)));
        }
        if (minutes > 0) {
            sb2.append(" ".concat(h((int) minutes, context, false)));
        }
        if (seconds > 0) {
            sb2.append(" ".concat(l(context, (int) seconds)));
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return t71.p.t0(sb3).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.time.ZonedDateTime, java.time.temporal.Temporal] */
    public static String d(Context context, ZonedDateTime zonedDateTime) {
        k71.k.g(context, "context");
        Object withZoneSameInstant = zonedDateTime.withZoneSameInstant(ZoneId.systemDefault());
        ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
        k71.k.d((Object) withZoneSameInstant);
        k71.k.d(now);
        if (Duration.between(withZoneSameInstant, now).toMinutes() < 1) {
            String string = context.getString(2131952409);
            k71.k.d(string);
            return string;
        }
        if (Duration.between(withZoneSameInstant, now).toHours() < 1) {
            return g((int) ChronoUnit.MINUTES.between(withZoneSameInstant, now), context, true);
        }
        if (Duration.between(withZoneSameInstant, now).toDays() < 1) {
            return e((int) ChronoUnit.HOURS.between(withZoneSameInstant, now), context, true);
        }
        if (Duration.between(withZoneSameInstant, now).toDays() >= 7 && !com.github.rudroid.utilities.t.f((ZonedDateTime) withZoneSameInstant, now)) {
            return Period.between(withZoneSameInstant.toLocalDate(), now.toLocalDate()).getYears() < 1 ? i((int) ChronoUnit.MONTHS.between(withZoneSameInstant, now), context, true) : m((int) ChronoUnit.YEARS.between(withZoneSameInstant, now), context, true);
        }
        return a((int) ChronoUnit.DAYS.between(withZoneSameInstant, now), context, true);
    }

    public static String e(int i, Context context, boolean z10) {
        String string = z10 ? context.getString(2131952413, Integer.valueOf(i)) : context.getString(2131952412, Integer.valueOf(i));
        k71.k.d(string);
        return string;
    }

    public static String f(int i, Context context, boolean z10) {
        String quantityString = z10 ? context.getResources().getQuantityString(2131820566, i, Integer.valueOf(i)) : context.getResources().getQuantityString(2131820565, i, Integer.valueOf(i));
        k71.k.d(quantityString);
        return quantityString;
    }

    public static String g(int i, Context context, boolean z10) {
        String string = z10 ? context.getString(2131952415, Integer.valueOf(i)) : context.getString(2131952414, Integer.valueOf(i));
        k71.k.d(string);
        return string;
    }

    public static String h(int i, Context context, boolean z10) {
        String quantityString = z10 ? context.getResources().getQuantityString(2131820568, i, Integer.valueOf(i)) : context.getResources().getQuantityString(2131820567, i, Integer.valueOf(i));
        k71.k.d(quantityString);
        return quantityString;
    }

    public static String i(int i, Context context, boolean z10) {
        String string = z10 ? context.getString(2131952417, Integer.valueOf(i)) : context.getString(2131952416, Integer.valueOf(i));
        k71.k.d(string);
        return string;
    }

    public static String j(Context context, ZonedDateTime zonedDateTime, boolean z10, boolean z11) {
        k71.k.g(context, "context");
        if (zonedDateTime == null) {
            return "";
        }
        ZonedDateTime now = ZonedDateTime.now(zonedDateTime.getZone());
        k71.k.d(now);
        if (Duration.between(zonedDateTime, now).toMinutes() < 1) {
            String string = z10 ? context.getString(2131952409) : context.getString(2131952421);
            k71.k.d(string);
            return string;
        }
        if (Duration.between(zonedDateTime, now).toHours() < 1) {
            Duration between = Duration.between(zonedDateTime, now);
            if (between.getSeconds() % 60 >= 30) {
                between = between.plusMinutes(1L);
            }
            return between.toHours() >= 1 ? z11 ? e((int) between.toHours(), context, z10) : f((int) between.toHours(), context, z10) : z11 ? g((int) between.toMinutes(), context, z10) : h((int) between.toMinutes(), context, z10);
        }
        if (Duration.between(zonedDateTime, now).toDays() < 1) {
            Duration between2 = Duration.between(zonedDateTime, now);
            if (between2.toMinutes() % 60 >= 30) {
                between2 = between2.plusHours(1L);
            }
            return between2.toDays() >= 1 ? z11 ? a((int) between2.toDays(), context, z10) : b((int) between2.toDays(), context, z10) : z11 ? e((int) between2.toHours(), context, z10) : f((int) between2.toHours(), context, z10);
        }
        if (com.github.rudroid.utilities.t.f(zonedDateTime, now)) {
            int V = m71.a.V(ChronoUnit.HOURS.between(zonedDateTime, now) / 24.0d);
            return z11 ? a(V, context, z10) : b(V, context, z10);
        }
        if (Period.between(zonedDateTime.toLocalDate(), now.toLocalDate()).getYears() >= 1) {
            int V2 = m71.a.V(ChronoUnit.MONTHS.between(zonedDateTime, now) / 12.0d);
            if (z11) {
                return m(V2, context, z10);
            }
            String quantityString = z10 ? context.getResources().getQuantityString(2131820574, V2, Integer.valueOf(V2)) : context.getResources().getQuantityString(2131820573, V2, Integer.valueOf(V2));
            k71.k.d(quantityString);
            return quantityString;
        }
        Period between3 = Period.between(zonedDateTime.toLocalDate(), now.toLocalDate());
        if (between3.getDays() >= 14) {
            between3 = between3.plusMonths(1L);
        }
        if (z11) {
            return i(between3.getMonths(), context, z10);
        }
        int months = between3.getMonths();
        String quantityString2 = z10 ? context.getResources().getQuantityString(2131820570, months, Integer.valueOf(months)) : context.getResources().getQuantityString(2131820569, months, Integer.valueOf(months));
        k71.k.d(quantityString2);
        return quantityString2;
    }

    public static String k(TextView textView, ZonedDateTime zonedDateTime) {
        k71.k.g(textView, "view");
        Context context = textView.getContext();
        k71.k.f(context, "getContext(...)");
        String string = textView.getResources().getString(2131954772, j(context, zonedDateTime, false, true));
        k71.k.f(string, "getString(...)");
        return string;
    }

    public static String l(Context context, int i) {
        String quantityString = context.getResources().getQuantityString(2131820571, i, Integer.valueOf(i));
        k71.k.d(quantityString);
        return quantityString;
    }

    public static String m(int i, Context context, boolean z10) {
        String string = z10 ? context.getString(2131952420, Integer.valueOf(i)) : context.getString(2131952419, Integer.valueOf(i));
        k71.k.d(string);
        return string;
    }

    public static void n(TextView textView, ZonedDateTime zonedDateTime, String str) {
        k71.k.g(textView, "view");
        k71.k.g(str, "format");
        Context context = textView.getContext();
        k71.k.f(context, "getContext(...)");
        textView.setContentDescription(String.format(str, Arrays.copyOf(new Object[]{j(context, zonedDateTime, true, false)}, 1)));
    }

    public static void o(TextView textView, ZonedDateTime zonedDateTime, boolean z10) {
        k71.k.g(textView, "view");
        Context context = textView.getContext();
        k71.k.f(context, "getContext(...)");
        textView.setText(j(context, zonedDateTime, z10, true));
    }
}
