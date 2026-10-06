import React, { useEffect, useRef } from 'react';
import { mountStudio } from './studio-core.js';

/*
 * React-обёртка студии.
 *
 * Вся логика (редактор, скачивание файлов, инструменты, консоль, темы) лежит в
 * общем модуле studio-core.js — он же используется Vue-сборкой, поэтому обе
 * вкладки приложения полностью совпадают по возможностям и дизайну.
 */
export default function App() {
  const hostRef = useRef(null);
  const studioRef = useRef(null);

  useEffect(() => {
    studioRef.current = mountStudio(hostRef.current, { framework: 'React 19' });
    return () => {
      if (studioRef.current) {
        studioRef.current.destroy();
        studioRef.current = null;
      }
    };
  }, []);

  return <div ref={hostRef} className="studio-host" />;
}
