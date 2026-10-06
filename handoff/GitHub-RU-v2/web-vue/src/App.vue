<script setup>
import { onMounted, onUnmounted, ref } from 'vue';
import { mountStudio } from './studio-core.js';

/*
 * Vue-обёртка студии: тот же общий модуль studio-core.js, что и в React-сборке
 * (единый код = одинаковые возможности, дизайн и поведение в обеих вкладках).
 */
const host = ref(null);
let studio = null;

onMounted(() => {
  studio = mountStudio(host.value, { framework: 'Vue 3.5' });
});

onUnmounted(() => {
  if (studio) {
    studio.destroy();
    studio = null;
  }
});
</script>

<template>
  <div ref="host" class="studio-host"></div>
</template>

<style>
html, body, #app { height: 100%; margin: 0; }
.studio-host { height: 100%; }
</style>
