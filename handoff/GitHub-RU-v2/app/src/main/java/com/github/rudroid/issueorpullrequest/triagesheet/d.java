package com.github.rudroid.issueorpullrequest.triagesheet;

import com.github.service.models.response.projects.ProjectFieldType;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16329a;

        static {
            int[] iArr = new int[ProjectFieldType.values().length];
            try {
                iArr[ProjectFieldType.REVIEWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProjectFieldType.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProjectFieldType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProjectFieldType.TRACKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProjectFieldType.REPOSITORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProjectFieldType.LINKED_PULL_REQUESTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProjectFieldType.MILESTONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProjectFieldType.ASSIGNEES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProjectFieldType.LABELS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProjectFieldType.TEXT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProjectFieldType.SINGLE_SELECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProjectFieldType.NUMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProjectFieldType.DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ProjectFieldType.ITERATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f16329a = iArr;
        }
    }
}
