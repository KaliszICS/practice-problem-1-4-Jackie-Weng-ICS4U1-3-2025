import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {
   @Test
   @DisplayName("")
   void getNameTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getName", cArg);
         // Enter code here
         assertEquals("Jacob Park", (String) method.invoke(null, 1, "file.txt"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getAgeTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getAge", cArg);
         // Enter code here
         assertEquals(16, (int) method.invoke(null, 2, "file.txt"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getAgeTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getAge", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, 0, "file.txt"));

      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getNumberTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getNumber", cArg);
         // Enter code here
         assertEquals(987654321, (int) method.invoke(null, 2, "file.txt"));

      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getNumberTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getNumber", cArg);
         // Enter code here
         assertEquals(123456789, (int) method.invoke(null, 1, "file.txt"));

      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getNumberTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getNumber", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, 10, "file.txt"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void fileAppendTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("fileAppend", cArg);
         // Enter code here
         String beforeString = "";
         String afterString = "";
         FileReader inputStream = null;

         try {
            inputStream = new FileReader("file2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
               beforeString += (char) c;
            }
         } catch (IOException e) {
            fail(e.getMessage());
         } finally {
            try {
               if (inputStream != null) {
                  inputStream.close();
               }
            } catch (IOException e) {
               fail(e.getMessage());
            }
         }

         method.invoke(null, "", "file2.txt");

         try {
            inputStream = new FileReader("file2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
               afterString += (char) c;
            }
         } catch (IOException e) {
            fail(e.getMessage());
         } finally {
            try {
               if (inputStream != null) {
                  inputStream.close();
               }
            } catch (IOException e) {
               fail(e.getMessage());
            }
         }

         assertEquals(afterString, beforeString);
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void fileAppendTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("fileAppend", cArg);
         // Enter code here
         String beforeString = "";
         String afterString = "";
         FileReader inputStream = null;

         try {
            inputStream = new FileReader("file2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
               beforeString += (char) c;
            }
         } catch (IOException e) {
            fail(e.getMessage());
         } finally {
            try {
               if (inputStream != null) {
                  inputStream.close();
               }
            } catch (IOException e) {
               fail(e.getMessage());
            }
         }

         method.invoke(null, " 23456", "file2.txt");

         try {
            inputStream = new FileReader("file2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
               afterString += (char) c;
            }
         } catch (IOException e) {
            fail(e.getMessage());
         } finally {
            try {
               if (inputStream != null) {
                  inputStream.close();
               }
            } catch (IOException e) {
               fail(e.getMessage());
            }
         }

         assertEquals(afterString, beforeString + " 23456");

      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void fileAppendTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("fileAppend", cArg);
         // Enter code here
         String beforeString = "";
         String afterString = "";
         FileReader inputStream = null;

         try {
            inputStream = new FileReader("file2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
               beforeString += (char) c;
            }
         } catch (IOException e) {
            fail(e.getMessage());
         } finally {
            try {
               if (inputStream != null) {
                  inputStream.close();
               }
            } catch (IOException e) {
               fail(e.getMessage());
            }
         }

         method.invoke(null, "hello", "file2.txt");

         try {
            inputStream = new FileReader("file2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
               afterString += (char) c;
            }
         } catch (IOException e) {
            fail(e.getMessage());
         } finally {
            try {
               if (inputStream != null) {
                  inputStream.close();
               }
            } catch (IOException e) {
               fail(e.getMessage());
            }
         }

         assertEquals(afterString, beforeString + "hello");
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getAgeTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getAge", cArg);
         // Enter code here
         assertEquals(17, (int) method.invoke(null, 3, "file.txt"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getNameTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getName", cArg);
         // Enter code here
         assertEquals("Tiffany Chiu", (String) method.invoke(null, 3, "file.txt"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void getNameTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, String.class };
         Method method = testClass.getDeclaredMethod("getName", cArg);
         // Enter code here
         assertEquals("", (String) method.invoke(null, 4, "file.txt"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
}
