-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2020 at 06:41 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agriculture`
--

-- --------------------------------------------------------

--
-- Table structure for table `bacterial_leaf_streak`
--

CREATE TABLE `bacterial_leaf_streak` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bacterial_leaf_streak`
--

INSERT INTO `bacterial_leaf_streak` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Bacterial leaf streak Is caused ', '1. Plant resistant varieties. '),
('by Xanthomonas campestris,', '2. Treat seeds with hot water.'),
('Oryzicola Symptoms are ', '3. Keep fields clean remove weed hosts '),
('restricted in the leaf. ', 'and plow under rice stubble, straw, rice '),
('', 'ratoons, and volunteer seedlings, which '),
('', 'may be infected by the bacteria.'),
('', '4. Use balanced amounts of plant nutrients, '),
('', 'especially nitrogen.'),
('', '5. Ensure good drainage of fields (in'),
('', 'conventionally flooded crops) and nurseries.'),
('', '6. Drain the field during severe flood.');

-- --------------------------------------------------------

--
-- Table structure for table `brown_spot`
--

CREATE TABLE `brown_spot` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `brown_spot`
--

INSERT INTO `brown_spot` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Brown spot disease, also known as ', '1. Monitor soil nutrients regularly'),
('\'sesame spot\' is caused by Bipolaris ', '2. Apply required fertilizers'),
('oryzae.', 'for soils that are low in silicon.'),
('', '3. Apply calcium silicate slag before '),
('', 'planting.');

-- --------------------------------------------------------

--
-- Table structure for table `early_blight`
--

CREATE TABLE `early_blight` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `early_blight`
--

INSERT INTO `early_blight` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Common on tomato ', '1. Prune or stake plants to improve air '),
('and potato plants, ', 'circulation and reduce fungal problems.'),
('early blight is caused by the  ', '2. Make sure to disinfect your pruning'),
('Fungus Alternaria Solani.', 'shears (one part bleach to 4 parts '),
('', 'water) after each cut.'),
('', '3. Keep the soil under plants clean and '),
('', 'free of garden debris. Add a layer '),
('', 'of Organic Compost to prevent the '),
('', 'spores from splashing back up onto'),
('', 'vegetation.');

-- --------------------------------------------------------

--
-- Table structure for table `farmer_information`
--

CREATE TABLE `farmer_information` (
  `Name` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Division` varchar(20) NOT NULL,
  `District` varchar(20) NOT NULL,
  `Month` varchar(20) NOT NULL,
  `Problem_Topic` varchar(20) NOT NULL,
  `Problem_Name` varchar(20) NOT NULL,
  `Duration` varchar(20) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `late_blight`
--

CREATE TABLE `late_blight` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `late_blight`
--

INSERT INTO `late_blight` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Late blight is caused by ', '1.Plant resistant cultivars when '),
('the fungus Phytophthora ', 'available.'),
('infestans.', '2. Remove volunteers from the garden '),
('', 'prior to planting and space plants far '),
('', 'enough apart to allow for plenty of air '),
('', 'circulation.'),
('', '3.Water in the early morning hours, or '),
('', 'use Soil Soaker, to give plants time to '),
('', 'dry out during the day avoid '),
('', 'overhead irrigation.');

-- --------------------------------------------------------

--
-- Table structure for table `mehedi`
--

CREATE TABLE `mehedi` (
  `Admin_Information` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mehedi`
--

INSERT INTO `mehedi` (`Admin_Information`) VALUES
('Md. Mehedi Hasan'),
('Id: 171-15-9021'),
('Section: M'),
('Department of Computer Science & Engineering'),
('Daffodil International University');

-- --------------------------------------------------------

--
-- Table structure for table `mosaic_virus`
--

CREATE TABLE `mosaic_virus` (
  `Problem_and_Cause_of_Diseases` varchar(300) NOT NULL,
  `Solution_In_Details` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mosaic_virus`
--

INSERT INTO `mosaic_virus` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Plant viruses can be ', '1. Fungicides will NOT treat this viral '),
('difficult to detect as ', 'disease.'),
('symptoms look similar ', '2. Plant resistant varieties when '),
('to many nutrient ', 'available or purchase transplants from '),
('deficiencies and vary ', 'a reputable source.'),
('depending on the age of ', '3. Do NOT save seed from infected '),
('the plant when infection', 'crops.'),
('occurs', '4. Avoid using tobacco around '),
('', 'susceptible plants. Cigarettes and other '),
('', 'tobacco products may be infected and '),
('', 'can spread the virus.');

-- --------------------------------------------------------

--
-- Table structure for table `nematode`
--

CREATE TABLE `nematode` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nematode`
--

INSERT INTO `nematode` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Ufra is locally known as \'dak pora\' or', '1. Use resistant varieties.'),
('\'thore morah\'. The causal organism is ', '2. At seedbed and transplanting, handpick '),
('Ditylenchus angustus, a minute, thread-like ', 'and destroy egg masses.'),
('ectoparasitic nematode. It survives and ', '3. Raise level of irrigation water periodically '),
('multiplies in the living host rice.', 'to submerge the eggs deposited on the lower '),
('', 'parts of the plant.'),
('', '4. Before transplanting, cut the leaf-top to '),
('', 'reduce carry-over of eggs from the seedbed '),
('', 'to the field.'),
('', '5. Ensure proper timing of planting and'),
('', 'synchronous planting, harvest crops at '),
('', 'ground level to remove the larvae in '),
('', 'stubble, remove stubble and volunteer rice, '),
('', 'plow and flood the field.'),
('', '6. Apply nitrogen fertilizer in split following '),
('', 'the recommended rate and time of '),
('', 'application.');

-- --------------------------------------------------------

--
-- Table structure for table `phoma_blight`
--

CREATE TABLE `phoma_blight` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phoma_blight`
--

INSERT INTO `phoma_blight` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Phoma blight  (Phoma glomerata) ', 'Keeping the mango properly fed '),
('is a soil-borne fungal disease that', 'and healthy helps prevent phoma '),
('shows it effects only on older mango ', 'blight, as well as keeping the area '),
('leaves.', 'under the tree clean, removing '),
('', 'falling foliage and fruit. When '),
('', 'watering, try to keep the wet soil '),
('', 'from splashing on the tree. Treat '),
('', 'infected trees with a copper '),
('', 'fungicide, making sure to cover all '),
('', 'surfaces of the tree when spraying. '),
('', 'Repeat the treatment every 14 to 20 '),
('', 'days.');

-- --------------------------------------------------------

--
-- Table structure for table `powdery_mildew`
--

CREATE TABLE `powdery_mildew` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `powdery_mildew`
--

INSERT INTO `powdery_mildew` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Powdery mildew is caused by ', 'The treatment for this fungus is a'),
('the Oidiummangiferae fungus and ', 'copper fungicide program that '),
('transported through the wind. It ', 'begins in early spring just as the '),
('appears when there are prolonged ', 'flowers develop and extends to the '),
('periods of cool, dry temperatures.', 'end of the crop season. Prevent the '),
('', 'problem by planting in the warmest '),
('', 'area of your landscape, pruning so'),
('', 'the mango has good air circulation, '),
('', 'and keeping the area underneath '),
('', 'and keeping the area underneath '),
('', 'fruit, and weeds.');

-- --------------------------------------------------------

--
-- Table structure for table `red_rust`
--

CREATE TABLE `red_rust` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `red_rust`
--

INSERT INTO `red_rust` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Red rust, also called algae spot, is ', 'The treatment for this disease is a '),
('caused by a parasitic alga, ', 'program of copper fungicides '),
('Cephaleuros spp., and usually doesn\'t', 'starting in the spring and applied '),
('cause any serious problems for', 'starting in the spring and applied '),
('the tree other than cosmetic ones. ', 'growing season. Organic foliar '),
('', 'fungicides have not been effective '),
('', 'in eliminating this disease.');

-- --------------------------------------------------------

--
-- Table structure for table `root_knot`
--

CREATE TABLE `root_knot` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `root_knot`
--

INSERT INTO `root_knot` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Root knot disease is caused by ', '1. Use nematicidal compounds: volatile '),
('Meloidogyne species. The nematode ', '(fumigants) and nonvolatile nematicides '),
('produces knots in root systems. Severely ', 'applied as soil drenches.'),
('attacked plants show stunted growth.', '2. Treat seeds with EPN and carbofuran.');

-- --------------------------------------------------------

--
-- Table structure for table `stem_rot`
--

CREATE TABLE `stem_rot` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stem_rot`
--

INSERT INTO `stem_rot` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Stem rot disease caused by Sclerotium ', '1. Use resistant cultivars.'),
('oryzae.', '2. Contact your local agriculture office for '),
('', 'an up-to-date list of available varieties.'),
('', '3. Burn straw and stubble or any crop '),
('', 'residue after harvest or let the straw '),
('', 'decompose.'),
('', '4. Drain the field to reduce sclerotia.'),
('', '5. Balance the use of fertilizer or perform '),
('', 'split application with high potash and lime '),
('', 'to increase soil pH.'),
('', '6. Chemicals such as fentin hydroxide '),
('', 'sprayed at the mid-tillering stage, '),
('', 'thiophanate-methyl sprayed at the time of '),
('', 'disease initiation can reduce stem rot '),
('', 'incidence in the rice field.'),
('', '7. Other fungicides such as Ferimzone and '),
('', 'validamycin A also show effectivity against'),
('', 'the fungus.');

-- --------------------------------------------------------

--
-- Table structure for table `symptoms`
--

CREATE TABLE `symptoms` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `symptoms`
--

INSERT INTO `symptoms` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('This fungus is spread from spores ', 'The treatment is two-pronged. '),
('that live in dead leaves on the ', 'First, it is important to keep the '),
('ground and transferred to the ', 'area under the mango tree free of '),
('mango through rain or irrigation ', 'debris and fallen fruit. Second, the '),
('splashing upon the tree. Once the ', 'trees may be treated with a copper '),
('tree is infected, the spores are ', 'fungicide at several intervals, '),
('transmitted to other branches via ', 'which include starting at the '),
('water droplets.', 'beginning of the growing period '),
('', 'and ending post-harvest.');

-- --------------------------------------------------------

--
-- Table structure for table `verticillium_wilt`
--

CREATE TABLE `verticillium_wilt` (
  `Problem_and_Cause_of_Diseases` varchar(200) NOT NULL,
  `Solution_In_Details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `verticillium_wilt`
--

INSERT INTO `verticillium_wilt` (`Problem_and_Cause_of_Diseases`, `Solution_In_Details`) VALUES
('Verticillium wilt is caused by ', 'Keeping mango trees properly '),
('the Verticillium albo-atrum and V. ', 'pruned, watered, and fed help keep '),
('dahlie fungus that lives in the soil.', 'the tree healthy and better able to '),
('', 'fight off an infection. Most trees '),
('', 'fight off an infection. Most trees '),
('', 'eventually die and have to be '),
('', 'removed from the landscape. '),
('', 'However, you can try to prolong '),
('', 'the life of the mango by pruning off '),
('', 'the affected areas as soon as you '),
('', 'notice the problem. Don\'t replant '),
('', 'back in the same area where '),
('', 'verticillium wilt has caused passed '),
('', 'problems.');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
