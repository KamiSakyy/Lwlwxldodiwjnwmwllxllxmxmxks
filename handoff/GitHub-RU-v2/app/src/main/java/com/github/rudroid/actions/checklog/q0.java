package com.github.rudroid.actions.checklog;

import com.github.rudroid.utilities.n;
import com.github.rudroid.utilities.y2;
import java.time.format.DateTimeFormatter;

/* loaded from: /home/user/work/p/classes.dex */
public interface q0 extends zh.b, n.c {
    public static final a Companion = a.f4864a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f4864a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final DateTimeFormatter f4865b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f4866c;

        static {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;
            k71.k.f(dateTimeFormatter, "RFC_1123_DATE_TIME");
            f4865b = dateTimeFormatter;
            f4866c = y2.a(16);
        }
    }

    public static final class b {
    }

    String j();
}
