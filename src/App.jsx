import { BrowserRouter } from "react-router-dom";
import { lazy, Suspense } from 'react';

import { About, Hero, Navbar } from "./components";

const Contonations = lazy(() => import("./components/Contonations.jsx"));
const Contact = lazy(() => import("./components/Contact.jsx"));
const Works = lazy(() => import("./components/Works.jsx"));
const CardAudio = lazy(() => import("./components/CardAudio.jsx"));
const StarsCanvas = lazy(() => import("./components/canvas/Stars.jsx"));
const FooterWeb = lazy(() => import("./components/FooterWeb.jsx"));

const App = () => {
  return (
    <BrowserRouter>
      <div className='relative z-0 bg-primary'>
        <div className='bg-hero-pattern bg-cover bg-no-repeat bg-center '>
          <Navbar />
          <Hero />
        </div>
        <About />

        <Suspense fallback={null}>
          <Contonations />
        </Suspense>

        <Suspense fallback={null}>
          <CardAudio />
        </Suspense>

        <Suspense fallback={null}>
          <Works />
        </Suspense>

        <div className='relative z-0'>

          <Suspense fallback={null}>
            <Contact />
          </Suspense>

          <Suspense fallback={null}>
            <StarsCanvas />
          </Suspense>

          <Suspense fallback={null}>
            <FooterWeb />
          </Suspense>

        </div>
      </div>
    </BrowserRouter>
  );
}

export default App;