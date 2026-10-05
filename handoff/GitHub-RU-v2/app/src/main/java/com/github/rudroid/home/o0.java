package com.github.rudroid.home;

import com.github.service.models.response.home.NavLinkIdentifier;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15005a;

        static {
            int[] iArr = new int[NavLinkIdentifier.values().length];
            try {
                iArr[NavLinkIdentifier.DISCUSSIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavLinkIdentifier.ISSUES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavLinkIdentifier.ORGANIZATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavLinkIdentifier.PROJECTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NavLinkIdentifier.PULL_REQUESTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NavLinkIdentifier.REPOSITORIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NavLinkIdentifier.STARRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NavLinkIdentifier.UNKNOWN__.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f15005a = iArr;
        }
    }
}
