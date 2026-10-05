package com.github.rudroid.checks;

import com.github.service.models.response.MergeCheckStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 {

    public static final class a implements yz0.l {
        public final String a() {
            return "https://github.com";
        }

        public final Boolean b() {
            return Boolean.FALSE;
        }

        public final String c() {
            return "non-empty";
        }

        public final String d() {
            return null;
        }

        public final MergeCheckStatus e() {
            return MergeCheckStatus.SUCCESS;
        }

        public final Integer getDuration() {
            return 10;
        }

        public final String getId() {
            return "1";
        }

        public final String getName() {
            return "Check run";
        }
    }

    public static final class b implements yz0.l {
        public final String a() {
            return "https://github.com";
        }

        public final Boolean b() {
            return Boolean.FALSE;
        }

        public final String c() {
            return "";
        }

        public final String d() {
            return null;
        }

        public final MergeCheckStatus e() {
            return MergeCheckStatus.SUCCESS;
        }

        public final Integer getDuration() {
            return 5;
        }

        public final String getId() {
            return "1";
        }

        public final String getName() {
            return "Check run";
        }
    }
}
