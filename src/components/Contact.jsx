import React, { useRef, useState } from "react";
import { motion } from "framer-motion";
import emailjs from "@emailjs/browser";
// internal imports
import { styles } from "../styles";
import { MicrophoneCanvas } from "./canvas";
import { SectionWrapper } from "../hoc";
import { slideIn } from "../utils/motion";

const Contact = () => {
  // define an empty useRef
  const formRef = useRef();
  // specify the use state field
  const [form, setForm] = useState({
    name: "",
    email: "",
    message: "",
  });
  // loading
  const [loading, setLoading] = useState(false);
  // create the handle change logic
  const handleChange = (e) => {
    // key pressed event
    const { target } = e;
    const { name, value } = target;

    setForm({
      ...form,
      [name]: value,
    });
  };
  // create the handle submit logic
  const handleSubmit = (e) => {
    e.preventDefault();
    setLoading(true);
    // send the message
    emailjs
      .send(
        import.meta.env.VITE_APP_EMAILJS_SERVICE_ID,
        import.meta.env.VITE_APP_EMAILJS_TEMPLATE_ID,
        {
          from_name: form.name,
          to_name: "Cristina Granda",
          from_email: form.email,
          to_email: "cristinagranda.locutora@gmail.com",
          message: form.message,
        },
        import.meta.env.VITE_APP_EMAILJS_PUBLIC_KEY
      )
      .then(
        () => {
          setLoading(false);
          alert("Gracias por tu mensaje, pronto nos pondremos en contacto contigo.");

          setForm({
            name: "",
            email: "",
            message: "",
          });
        },
        (error) => {
          setLoading(false);
          console.error(error);

          alert("Ahh, algo salio mal.Por favor vuelva a intentar.");
        }
      );
  };

  return (
    // create the layout of contact form wrap everything in a single div
    <div
    // to xtra large services
    className={`xl:mt-12 flex xl:flex-row flex-col-reverse gap-10 overflow-hidden`}
    >
     
      <motion.div
      // para que la plantilla de about entre por la izquierda y tipo de animacion tween 
        variants={slideIn("left", "tween", 0.2, 0.65)}
        className='flex-[0.75] bg-black-100 p-8 rounded-2xl'
      >
        {/* created the basis of the div, slide  */}
        <p className={styles.sectionSubText}>Ponerse en Contacto</p>
        <h3 className={styles.sectionHeadText}>Contacto</h3>
        <p className={styles.sectionSubText2}>Describe tu proyecto en el formulario para recibir una cotización personalizada o me puedes escribir directo a cristinagranda.locutora@gmail.com</p>

        {/* create a form */}
        <form
          ref={formRef}
          onSubmit={handleSubmit}
          className='mt-12 flex flex-col gap-8'
        >
          {/* name section */}
          <label className='flex flex-col'>
            <span className='text-white font-medium mb-4'>Tu Nombre</span>
            <input
              type='text'
              name='name'
              value={form.name}
              onChange={handleChange}
              placeholder="¿Cuál es tu nombre?"
              className='bg-tertiary py-4 px-6 placeholder:text-secondary text-white rounded-lg outline-none border-none font-medium'
            />
          </label>

          {/* email section */}
          <label className='flex flex-col'>
            <span className='text-white font-medium mb-4'>Tu email</span>
            <input
              type='email'
              name='email'
              value={form.email}
              onChange={handleChange}
              placeholder="¿Cuál es tu Email?"
              className='bg-tertiary py-4 px-6 placeholder:text-secondary text-white rounded-lg outline-none border-none font-medium'
            />
          </label>

          {/* query section */}
          <label className='flex flex-col'>
            <span className='text-white font-medium mb-4'>Tu Mensaje</span>
            <textarea
              rows={7}
              name='message'
              value={form.message}
              onChange={handleChange}
              placeholder='¿Que deseas decirme?'
              className='bg-tertiary py-4 px-6 placeholder:text-secondary text-white rounded-lg outline-none border-none font-medium'
            />
          </label>

          {/* create the button component */}
          <button
            type='submit'
            className='bg-tertiary py-3 px-8 rounded-xl outline-none w-fit text-white font-bold shadow-md shadow-primary'
          >
            {loading ? "Enviando..." : "Enviar"}
          </button>

        </form>
      </motion.div>

      {/* model section */}
      
      <motion.div
        // planeta entre por la derecha
        variants={slideIn("right", "tween", 0.2, 0.65)}
        className='xl:flex-1 xl:h-auto md:h-[550px] h-[475px]'
      >
        <MicrophoneCanvas />
      </motion.div>


    </div>
  )
}

export default SectionWrapper(Contact, "contactame");